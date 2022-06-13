/*
Klaus Traubner
218009496
13 June 2022
ADP372S
 */
package Repository;

import Domain.Address;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


public class AddressRepostoryImpl implements AddressRepo {

    private Set<Address> addressSet;
    private static AddressRepostoryImpl ADDRESS_REPOSITORY;

    private AddressRepostoryImpl () {this.addressSet = new HashSet<>(); } //?

    public static AddressRepostoryImpl getAddressRepository () {
        if(ADDRESS_REPOSITORY == null )
            ADDRESS_REPOSITORY = new AddressRepostoryImpl();
        return ADDRESS_REPOSITORY;

    }

    public Address save (Address address)
    {
        Optional<Address> read = read(address.getUnitNumber());
        if(read.isPresent())
        {
            delete((read.get()));

        }
        this.addressSet.add(address);
        return address;
    }

    @Override
    public Optional<Address> read(String unitNumber) //Change
    {
        return this.addressSet.stream().filter(a -> a.getUnitNumber().equalsIgnoreCase(unitNumber)).findFirst();
    }

    public void delete(Address address) {
        this.addressSet.remove(address);
    }

    @Override
    public Set<Address> getAll() {
       // return set<Address> getAll(){return this.addressSet;}
        return null;
    }
}