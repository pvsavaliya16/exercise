package com.mycompany.exc4;

import com.mycompany.exc4.dao.AddressDao;
import com.mycompany.exc4.dao.EducationDao;
import com.mycompany.exc4.dao.StudentDao;
import com.mycompany.exc4.daoImpl.AddressDaoImpl;
import com.mycompany.exc4.daoImpl.EducationDaoImpl;
import com.mycompany.exc4.daoImpl.StudentDaoImpl;
import com.mycompany.exc4.model.Address;
import com.mycompany.exc4.model.Education;
import com.mycompany.exc4.model.Student;

/**
 *
 * @author parth
 */
public class Main {

    public static void main(String[] args) {
        StudentDao sdao = new StudentDaoImpl();
        AddressDao adao = new AddressDaoImpl();
        EducationDao edao = new EducationDaoImpl();
       
        Student s = new Student("Parth", "Savaliya", "V", "Mr.", "BE", "psavaliya@argusoft.in", "9876543210", null, null);
        Address a = new Address("abc", "def", "Gandhinagar", "Gujrat", "Saurashtra", "India", null);
        Education e = new Education("Engineer", "a good engineer", "2019", "JNV", null);
        s.setEducation(e);
        s.setAddress(a);
        a.setStudent(s);
        e.setStudent(s);
        sdao.addStudent(s);

    }
}
