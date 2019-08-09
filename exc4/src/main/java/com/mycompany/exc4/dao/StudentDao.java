package com.mycompany.exc4.dao;

import com.mycompany.exc4.model.Student;
import java.util.List;

/**
 *
 * @author parth
 */
public interface StudentDao {
    public void addStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudent(Long id);
    public void updateStudent(Long id, Student student);
    public void removeStudent(Long id);
}
