/* StudentAddressServiceImplTest.java
   ServiceImpl Test for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package ac.za.cput.service.StudentAddress.lookup.Impl;

import ac.za.cput.SchoolManagementApplication;
import ac.za.cput.domain.StudentAddress.Address;
import ac.za.cput.domain.StudentAddress.StudentAddress;
import ac.za.cput.factory.StudentAddress.StudentAddressFactory;
import ac.za.cput.service.StudentAddress.lookup.StudentAddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SchoolManagementApplication.class)
class StudentAddressServiceImplTest
{
    private StudentAddress studentAddress,saved;

    @Autowired private StudentAddressService service;

    @BeforeEach
    void setUp() {
        Address address = new Address();
        this.studentAddress = StudentAddressFactory.build("214234169",address);
        this.saved = service.save(this.studentAddress);
    }

    @Test
    void a_save() {
        Address address = new Address();
        this.studentAddress = StudentAddressFactory.build("152683924",
                address);
        this.saved = service.save(this.studentAddress);
        System.out.println(saved);
        assertNotNull(saved);
    }

    @Test
    void b_read() {
        Address address = new Address();
        Optional<StudentAddress> read = this.service.read(studentAddress.getStudentId());
        System.out.println(read);
    }

    @Test
    void c_delete() {
        Address address = new Address();
        this.service.delete(studentAddress);
    }

    @Test
    List<StudentAddress> d_findAll() {
        return this.service.findAll();
    }
}