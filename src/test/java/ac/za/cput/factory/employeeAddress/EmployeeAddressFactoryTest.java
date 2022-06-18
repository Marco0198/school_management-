package ac.za.cput.factory.employeeAddress;

import ac.za.cput.domain.address.Address;
import ac.za.cput.domain.employeeAddress.EmployeeAddress;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * EmployeeAddressFactoryTest.java
 * Date : 13th June 2022
 */

class EmployeeAddressFactoryTest {

    // Test should fail
    @Test
    public void EmployeeAddressTestShouldFail()
    {
        Address address = new Address();
        address.equals("15 Hanover Street");
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("", address);
        System.out.println(employeeAddress.toString());
        assertNotNull(employeeAddress);
    }

    // Test should pass
    @Test
    public void EmployeeAddressTestShouldPass()
    {
        Address address = new Address();
        address.equals("15 Hanover Street");
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("25", address);
        System.out.println(employeeAddress.toString());
        assertNotNull(employeeAddress);
    }
}