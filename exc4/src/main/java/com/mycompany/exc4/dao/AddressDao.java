package com.mycompany.exc4.dao;

import com.mycompany.exc4.model.Address;
import java.util.List;

/**
 *
 * @author parth
 */
public interface AddressDao {
    public void addAddress(Address address);
    public List<Address> getAllAddresses();
    public Address getAddress(Long id);
    public void updateAddress(Long id, Address address);
    public void removeAddress(Long id);
}
