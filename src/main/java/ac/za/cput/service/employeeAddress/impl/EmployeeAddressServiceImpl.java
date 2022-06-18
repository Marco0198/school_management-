package ac.za.cput.service.employeeAddress.impl;

import ac.za.cput.domain.city.City;
import ac.za.cput.domain.employeeAddress.EmployeeAddress;
import ac.za.cput.repository.employeeAddress.EmployeeAddressRepository;
import ac.za.cput.service.employeeAddress.IEmployeeAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * EmployeeAddressServiceImplService.java
 * Date : 13th June 2022
 */

@Service
public class EmployeeAddressServiceImpl implements IEmployeeAddressService {
    private final EmployeeAddressRepository repository;
    @Autowired
    public EmployeeAddressServiceImpl(EmployeeAddressRepository repository) {
        this.repository = repository;
    }
    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        return this.repository.save(employeeAddress);
    }
    @Override
    public Optional<EmployeeAddress> read(String staffId) {
        return this.repository.findById(staffId);
    }
    @Override
    public void delete(EmployeeAddress ea) {
        repository.delete(ea);
    }
    public Optional <EmployeeAddress> findNameByStaffId(String staffId) {
        return repository.findNameByStaffId(staffId);
    }
    @Override
    public Set<EmployeeAddress> findAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
