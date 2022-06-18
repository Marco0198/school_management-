package ac.za.cput.service.employee.impl;
import ac.za.cput.domain.employee.Employee;
import ac.za.cput.domain.name.Name;
import ac.za.cput.factory.employee.EmployeeFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
@SpringBootTest
class EmployeeServiceImplTest {
      @Autowired public EmployeeServiceImpl service;
    public Name name;
    public Employee employee1;
    @BeforeEach
    void setUp() {
        this.name= new Name("marco","mulonday","tshimanga");
        this.employee1= EmployeeFactory.createEmployee("44","thh@gmail.com",this.name);
    }

    @Test
    void  save() {

        Employee employee= this.service.save(this.employee1);
        System.out.println(employee.toString());
        assertNotNull(employee);
       // assertSame(this.employee1,employee);
    }

    @Test
    void read() {
        Employee employee= this.service.save(this.employee1);
        Optional<Employee> read= this.service.read(employee1.getStaffId());
         assertAll(()->assertTrue(read.isPresent()));
    }



    @Test
    void delete() {
        this.service.delete(this.employee1);
        Set<Employee> employeeList= this.service.findAll();
        assertEquals(0,employeeList.size());

    }

    @Test
    void findAll() {
        this.service.save(this.employee1);
        Set<Employee> employeeList= this.service.findAll();
        assertEquals(1,employeeList.size());

    }
}