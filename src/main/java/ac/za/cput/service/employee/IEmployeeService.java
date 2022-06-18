package ac.za.cput.service.employee;
import ac.za.cput.domain.employee.Employee;
import ac.za.cput.service.IService;
import java.util.Set;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
public interface IEmployeeService extends IService<Employee,String> {
    Set<Employee> findAll();

}
