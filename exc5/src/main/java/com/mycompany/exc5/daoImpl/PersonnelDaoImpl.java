package com.mycompany.exc5.daoImpl;

import com.mycompany.exc5.Util.EntityManagerUtil;
import com.mycompany.exc5.Util.MethodUtil;
import com.mycompany.exc5.dao.PersonnelDao;
import com.mycompany.exc5.model.Personnel;
import com.mycompany.exc5.model.Proposal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author parth
 */
public class PersonnelDaoImpl implements PersonnelDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void addPersonnel(Personnel personnel) {
        MethodUtil.addEntity(personnel);
    }

    @Override
    public List<Personnel> getAllPersonnels() {
        List<Personnel> list = new ArrayList<>();
        try {
            list = entityManager.createQuery("SELECT p from Personnel p", Personnel.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
