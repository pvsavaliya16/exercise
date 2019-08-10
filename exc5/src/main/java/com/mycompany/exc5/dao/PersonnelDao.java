package com.mycompany.exc5.dao;

import com.mycompany.exc5.model.Personnel;
import java.util.List;

/**
 *
 * @author parth
 */
public interface PersonnelDao {
    public void addPersonnel(Personnel personnel);
    
    public List<Personnel> getAllPersonnels();
}
