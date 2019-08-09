package com.mycompany.exc4.daoImpl;

import com.mycompany.exc4.dao.StudentDao;
import com.mycompany.exc4.model.Student;
import com.mycompany.exc4.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author parth
 */
public class StudentDaoImpl implements StudentDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void addStudent(Student student) {
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudent(Long id) {
        return null;
    }

    @Override
    public void updateStudent(Long id, Student student) {
    }

    @Override
    public void removeStudent(Long id) {
    }

}
