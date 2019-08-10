package com.mycompany.exc5.Util;

import javax.persistence.EntityManager;

/**
 *
 * @author parth
 */
public class MethodUtil {
    
    private static EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    public static <T> void addEntity(T t) {
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();
    }
}
