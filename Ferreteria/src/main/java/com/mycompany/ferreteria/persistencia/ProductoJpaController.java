
package com.mycompany.ferreteria.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.ferreteria.logica.Distribuidor;
import com.mycompany.ferreteria.logica.Producto;
import com.mycompany.ferreteria.persistencia.exceptions.NonexistentEntityException;
import com.mycompany.ferreteria.persistencia.exceptions.PreexistingEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ProductoJpaController implements Serializable {

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public ProductoJpaController() {
        emf = Persistence.createEntityManagerFactory("FerreteriaPU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Distribuidor distribuidor = producto.getDistribuidor();
            if (distribuidor != null) {
                distribuidor = em.getReference(distribuidor.getClass(), distribuidor.getIdDistribuidor());
                producto.setDistribuidor(distribuidor);
            }
            em.persist(producto);
            if (distribuidor != null) {
                distribuidor.getListaProducto().add(producto);
                distribuidor = em.merge(distribuidor);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProducto(producto.getIdProducto()) != null) {
                throw new PreexistingEntityException("Producto " + producto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getIdProducto());
            Distribuidor distribuidorOld = persistentProducto.getDistribuidor();
            Distribuidor distribuidorNew = producto.getDistribuidor();
            if (distribuidorNew != null) {
                distribuidorNew = em.getReference(distribuidorNew.getClass(), distribuidorNew.getIdDistribuidor());
                producto.setDistribuidor(distribuidorNew);
            }
            producto = em.merge(producto);
            if (distribuidorOld != null && !distribuidorOld.equals(distribuidorNew)) {
                distribuidorOld.getListaProducto().remove(producto);
                distribuidorOld = em.merge(distribuidorOld);
            }
            if (distribuidorNew != null && !distribuidorNew.equals(distribuidorOld)) {
                distribuidorNew.getListaProducto().add(producto);
                distribuidorNew = em.merge(distribuidorNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = producto.getIdProducto();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getIdProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            Distribuidor distribuidor = producto.getDistribuidor();
            if (distribuidor != null) {
                distribuidor.getListaProducto().remove(producto);
                distribuidor = em.merge(distribuidor);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Producto findProducto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
