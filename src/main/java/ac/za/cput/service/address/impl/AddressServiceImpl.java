/*
Klaus Traubner
218009496
18 June 2022
AddressServiceImpl.java
 */
package ac.za.cput.service.address.impl;

import ac.za.cput.domain.address.Address;
import ac.za.cput.repository.address.AddressRepository;
import ac.za.cput.service.address.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class AddressServiceImpl implements IAddressService {

    private final AddressRepository repository;
    @Autowired
    public AddressServiceImpl(AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public Address save(Address address) {
        return this.repository.save(address);
    }

    @Override
    public Optional<Address> read(String s) {
        return Optional.empty();
    }

    @Override
    public void delete(Address a) {
        repository.delete(a);
    }

    @Override
    public Set<Address> findAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

}
