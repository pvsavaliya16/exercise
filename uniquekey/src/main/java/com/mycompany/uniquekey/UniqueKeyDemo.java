/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uniquekey;

import com.mycompany.uniquekey.dao.PersonDao;
import com.mycompany.uniquekey.dao.PersonDaoImpl;
import com.mycompany.uniquekey.model.Person;

/**
 *
 * @author parth
 */
public class UniqueKeyDemo {

    public static void main(String[] args) {
        PersonDao personRepo = new PersonDaoImpl();
         System.out.println("All people : ");
        Person p = new Person();
        p.setName("parth");
        p.setPhone("9876543210");
        personRepo.addPerson(p);
        //  (personRepo.getAllPersons());
         System.out.println("Adding....");
    }
}
