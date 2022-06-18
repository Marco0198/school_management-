package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.service.IService;

import java.util.Set;

public interface IEmployeeService extends IService<Employee,String> {
    Set<Employee> findAll();

}
