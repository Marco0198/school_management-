package ac.za.cput.factory.employee;
import ac.za.cput.domain.employee.Employee;
import ac.za.cput.domain.name.Name;
import org.junit.jupiter.api.Test;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void createEmployee() {
        Name name= new Name("marco","mulonday","tshimanga");
        Employee employee = EmployeeFactory.createEmployee("44","thh",name);
        System.out.println(employee.toString());
        assertNotNull(employee);
    }
}