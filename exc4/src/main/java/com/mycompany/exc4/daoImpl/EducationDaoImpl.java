package com.mycompany.exc4.daoImpl;

import com.mycompany.exc4.dao.EducationDao;
import com.mycompany.exc4.model.Education;
import com.mycompany.exc4.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author parth
 */
public class EducationDaoImpl implements EducationDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void addEducation(Education education) {
        entityManager.getTransaction().begin();
        entityManager.persist(education);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Education> getAllEducations() {
        return null;
    }

    @Override
    public Education getEducation(Long id) {
        return null;
    }

    @Override
    public void updateEducation(Long id, Education education) {

    }

    @Override
    public void removeEducation(Long id) {

    }

}
