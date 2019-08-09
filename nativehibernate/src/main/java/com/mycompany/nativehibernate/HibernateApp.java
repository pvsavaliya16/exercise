/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nativehibernate;

import com.mycompany.nativehibernate.model.Helloworld;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author parth
 */
public class HibernateApp {
    public static void main(String[] args) {
        try (SessionFactory sessFact = HibernateUtil.getSessionFactory()) {
            Session session = sessFact.getCurrentSession();
            Transaction tr = session.beginTransaction();
            Helloworld helloworld = new Helloworld();
            helloworld.setMessage("hellooabc");
            session.save(helloworld);
            
             System.out.println("Successfully inserted");
            List<Helloworld> all = 
                    session.createNativeQuery("select * from helloworld", Helloworld.class).getResultList();
            
            all.forEach(message -> {
                 System.out.println(message);
            });
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
}
