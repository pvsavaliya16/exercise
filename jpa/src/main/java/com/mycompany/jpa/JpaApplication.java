/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpa;

import com.mycompany.jpa.modal.Helloworld;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author parth
 */
public class JpaApplication {
    private static final String UNIT_NAME = "helloworld";
    private static EntityManagerFactory factory;
    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(UNIT_NAME);
        EntityManager entityManager = factory.createEntityManager();
        
        Query findAll = entityManager.createQuery("SELECT h FROM Helloworld h");
        List<Helloworld> allMessages = findAll.getResultList();
        allMessages.forEach(message -> {
            System.out.println(message);
        });
        System.out.println(create());
        System.out.println(create());
        entityManager.clear();
        
    }
    
    static String create() {
        EntityManager entityManager = factory.createEntityManager();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter message: ");
        String message = s.nextLine();
        Helloworld h = new Helloworld(message);
        entityManager.getTransaction().begin();
        entityManager.persist(h);
        entityManager.getTransaction().commit();
        entityManager.clear();
        return "Created!!";
        
    }
}
