//package ac.za.cput.service.employeeAddress.impl;
//
//import ac.za.cput.domain.address.Address;
//import ac.za.cput.domain.employeeAddress.EmployeeAddress;
//import ac.za.cput.factory.employeeAddress.EmployeeAddressFactory;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import java.util.Optional;
//import java.util.Set;
//import static org.junit.jupiter.api.Assertions.*;
///*
// * Student Name: Damian du Toit
// * Student Number: 219200203
// * EmployeeAddressServiceImplTest.java
// * Date : 13th June 2022
// */
//
//@SpringBootTest
//class EmployeeAddressServiceImplTest {
//    @Autowired
//    public EmployeeAddressServiceImpl service;
//    public EmployeeAddress employeeAddress1;
//    public Address address;
//
//    @BeforeEach
//    void setUp() {
//        this.employeeAddress1 = EmployeeAddressFactory.build("7500", address);
//    }
//
//    @Test
//    void  save() {
//        EmployeeAddress employeeAddress = this.service.save(this.employeeAddress1);
//        System.out.println(employeeAddress.toString());
//        assertNotNull(employeeAddress);
//    }
//
//    @Test
//    void read() {
//        EmployeeAddress employeeAddress = this.service.save(this.employeeAddress1);
//        Optional<EmployeeAddress> read = this.service.read(employeeAddress.getStaffId());
//        assertAll(()->assertTrue(read.isPresent()));
//    }
//
//    @Test
//    void delete() {
//        this.service.delete(this.employeeAddress1);
//        Set<EmployeeAddress> employeeAddressList = this.service.findAll();
//        assertEquals(0,employeeAddressList.size());
//    }
//
//    @Test
//    void findAll() {
//        this.service.save(this.employeeAddress1);
//        Set<EmployeeAddress> employeeAddressList = this.service.findAll();
//        assertEquals(1,employeeAddressList.size());
//    }
//}