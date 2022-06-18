/*
Klaus Traubner
218009496
18 June 2022
IAddressService.java
 */

package ac.za.cput.service.address;

import ac.za.cput.domain.address.Address;
import ac.za.cput.service.IService;

import java.util.Set;

public interface IAddressService extends IService <Address, String> {

        Set<Address> findAll();

}
