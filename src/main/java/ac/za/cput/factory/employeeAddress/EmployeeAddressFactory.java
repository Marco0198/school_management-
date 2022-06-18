package ac.za.cput.factory.employeeAddress;

import ac.za.cput.domain.address.Address;
import ac.za.cput.domain.employeeAddress.EmployeeAddress;
import ac.za.cput.helper.StringHelper;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * EmployeeAddressFactory.java
 * Date : 13th June 2022
 */
public class EmployeeAddressFactory {
    public static EmployeeAddress build(String staffId, Address address){

        StringHelper.checkStringParam("id", staffId);

        return new EmployeeAddress.Builder()
                .setStaffId(staffId)
                .setAddress(address)
                .build();
    }
}
