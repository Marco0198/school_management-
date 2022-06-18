package ac.za.cput.service.employeeAddress;

import ac.za.cput.domain.employeeAddress.EmployeeAddress;
import ac.za.cput.service.IService;
import java.util.Set;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * IEmployeeAddressService.java
 * Date : 13th June 2022
 */
public interface IEmployeeAddressService extends IService<EmployeeAddress, String> {
    Set<EmployeeAddress> findAll();
}
