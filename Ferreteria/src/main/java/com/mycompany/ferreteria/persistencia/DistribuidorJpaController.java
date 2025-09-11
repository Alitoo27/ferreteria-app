
package com.mycompany.ferreteria.persistencia;

import com.mycompany.ferreteria.logica.Distribuidor;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.ferreteria.logica.Producto;
import com.mycompany.ferreteria.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DistribuidorJpaController implements Serializable {

    public DistribuidorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public DistribuidorJpaController() {
        emf = Persistence.createEntityManagerFactory("FerreteriaPU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Distribuidor distribuidor) {
        if (distribuidor.getListaProducto() == null) {
            distribuidor.setListaProducto(new ArrayList<Producto>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Producto> attachedListaProducto = new ArrayList<Producto>();
            for (Producto listaProductoProductoToAttach : distribuidor.getListaProducto()) {
                listaProductoProductoToAttach = em.getReference(listaProductoProductoToAttach.getClass(), listaProductoProductoToAttach.getCodigo());
                attachedListaProducto.add(listaProductoProductoToAttach);
            }
            distribuidor.setListaProducto(attachedListaProducto);
            em.persist(distribuidor);
            for (Producto listaProductoProducto : distribuidor.getListaProducto()) {
                Distribuidor oldDistribuidorOfListaProductoProducto = listaProductoProducto.getDistribuidor();
                listaProductoProducto.setDistribuidor(distribuidor);
                listaProductoProducto = em.merge(listaProductoProducto);
                if (oldDistribuidorOfListaProductoProducto != null) {
                    oldDistribuidorOfListaProductoProducto.getListaProducto().remove(listaProductoProducto);
                    oldDistribuidorOfListaProductoProducto = em.merge(oldDistribuidorOfListaProductoProducto);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Distribuidor distribuidor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Distribuidor persistentDistribuidor = em.find(Distribuidor.class, distribuidor.getIdDistribuidor());
            List<Producto> listaProductoOld = persistentDistribuidor.getListaProducto();
            List<Producto> listaProductoNew = distribuidor.getListaProducto();
            List<Producto> attachedListaProductoNew = new ArrayList<Producto>();
            for (Producto listaProductoNewProductoToAttach : listaProductoNew) {
                listaProductoNewProductoToAttach = em.getReference(listaProductoNewProductoToAttach.getClass(), listaProductoNewProductoToAttach.getCodigo());
                attachedListaProductoNew.add(listaProductoNewProductoToAttach);
            }
            listaProductoNew = attachedListaProductoNew;
            distribuidor.setListaProducto(listaProductoNew);
            distribuidor = em.merge(distribuidor);
            for (Producto listaProductoOldProducto : listaProductoOld) {
                if (!listaProductoNew.contains(listaProductoOldProducto)) {
                    listaProductoOldProducto.setDistribuidor(null);
                    listaProductoOldProducto = em.merge(listaProductoOldProducto);
                }
            }
            for (Producto listaProductoNewProducto : listaProductoNew) {
                if (!listaProductoOld.contains(listaProductoNewProducto)) {
                    Distribuidor oldDistribuidorOfListaProductoNewProducto = listaProductoNewProducto.getDistribuidor();
                    listaProductoNewProducto.setDistribuidor(distribuidor);
                    listaProductoNewProducto = em.merge(listaProductoNewProducto);
                    if (oldDistribuidorOfListaProductoNewProducto != null && !oldDistribuidorOfListaProductoNewProducto.equals(distribuidor)) {
                        oldDistribuidorOfListaProductoNewProducto.getListaProducto().remove(listaProductoNewProducto);
                        oldDistribuidorOfListaProductoNewProducto = em.merge(oldDistribuidorOfListaProductoNewProducto);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = distribuidor.getIdDistribuidor();
                if (findDistribuidor(id) == null) {
                    throw new NonexistentEntityException("The distribuidor with id " + id + " no longer exists.");
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
            Distribuidor distribuidor;
            try {
                distribuidor = em.getReference(Distribuidor.class, id);
                distribuidor.getIdDistribuidor();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The distribuidor with id " + id + " no longer exists.", enfe);
            }
            List<Producto> listaProducto = distribuidor.getListaProducto();
            for (Producto listaProductoProducto : listaProducto) {
                listaProductoProducto.setDistribuidor(null);
                listaProductoProducto = em.merge(listaProductoProducto);
            }
            em.remove(distribuidor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Distribuidor> findDistribuidorEntities() {
        return findDistribuidorEntities(true, -1, -1);
    }

    public List<Distribuidor> findDistribuidorEntities(int maxResults, int firstResult) {
        return findDistribuidorEntities(false, maxResults, firstResult);
    }

    private List<Distribuidor> findDistribuidorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Distribuidor.class));
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

    public Distribuidor findDistribuidor(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Distribuidor.class, id);
        } finally {
            em.close();
        }
    }
    
    public void editSinProductos(Distribuidor distribuidor) throws NonexistentEntityException, Exception {
    EntityManager em = null;
    try {
        em = getEntityManager();
        em.getTransaction().begin();

        // Verifica si existe el distribuidor antes de hacer el merge
        Distribuidor existing = em.find(Distribuidor.class, distribuidor.getIdDistribuidor());
        if (existing == null) {
            throw new NonexistentEntityException("El distribuidor con id " + distribuidor.getIdDistribuidor() + " no existe.");
        }

        em.merge(distribuidor); // Solo actualiza los campos simples (no relaciones)
        em.getTransaction().commit();
    } catch (Exception ex) {
        throw ex;
    } finally {
        if (em != null) {
            em.close();
        }
    }
}


    public int getDistribuidorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Distribuidor> rt = cq.from(Distribuidor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
