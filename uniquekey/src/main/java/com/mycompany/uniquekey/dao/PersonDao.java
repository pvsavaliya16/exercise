/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uniquekey.dao;

import com.mycompany.uniquekey.model.Person;
import java.util.List;

/**
 *
 * @author parth
 */
public interface PersonDao {
    public void addPerson(Person person);
    public List<Person> getAllPersons();
    public Person getPerson(Long id);
    public void updatePerson(Long id, Person person);
    public void removePerson(Long id);
}
