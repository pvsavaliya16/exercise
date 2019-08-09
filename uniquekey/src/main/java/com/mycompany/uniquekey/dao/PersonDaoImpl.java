/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uniquekey.dao;

import com.mycompany.uniquekey.model.Person;
import com.mycompany.uniquekey.util.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 *
 * @author parth
 */
public class PersonDaoImpl implements PersonDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    
    public void addPerson(Person person) {
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
         ("\n\n\n\n Created");
        

    }

    @Override
    public List<Person> getAllPersons() {
        List<Person> list = new ArrayList<>();
        try {
            list = entityManager.createQuery("SELECT p from Person p", Person.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Person getPerson(Long id) {
        Person person = null;
        try {
            person = entityManager.find(Person.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    @Transactional
    public void updatePerson(Long id, Person person) {
        Person oldPerson = entityManager.find(Person.class, id);
     
         ("\n\n\n\n Updated");

    }

    @Override
    @Transactional
    public void removePerson(Long id) {
        Person old = entityManager.find(Person.class, id);
        entityManager.remove(old);
         ("\n\n\n\n Removed");

    }

}
