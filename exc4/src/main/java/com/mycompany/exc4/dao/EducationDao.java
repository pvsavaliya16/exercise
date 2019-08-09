package com.mycompany.exc4.dao;

import com.mycompany.exc4.model.Education;
import java.util.List;

/**
 *
 * @author parth
 */
public interface EducationDao {
    public void addEducation(Education education);
    public List<Education> getAllEducations();
    public Education getEducation(Long id);
    public void updateEducation(Long id, Education education);
    public void removeEducation(Long id);
}
