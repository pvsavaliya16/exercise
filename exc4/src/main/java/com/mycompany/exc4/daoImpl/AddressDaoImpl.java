package com.mycompany.exc4.daoImpl;

import com.mycompany.exc4.dao.AddressDao;
import com.mycompany.exc4.model.Address;
import com.mycompany.exc4.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author parth
 */
public class AddressDaoImpl implements AddressDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void addAddress(Address address) {
        entityManager.getTransaction().begin();
        entityManager.persist(address);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Address> getAllAddresses() {
        return null;
    }

    @Override
    public Address getAddress(Long id) {
        return null;
    }

    @Override
    public void updateAddress(Long id, Address address) {

    }

    @Override
    public void removeAddress(Long id) {

    }

}
