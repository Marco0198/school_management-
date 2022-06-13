/*
Klaus Traubner
218009496
13 June 2022
ADP372S
 */
package Repository;

import Domain.Address;

import java.util.Set;

public interface AddressRepo  extends IRepo<Address, String> {

    public Set<Address> getAll();

}