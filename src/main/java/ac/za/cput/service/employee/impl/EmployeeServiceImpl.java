package ac.za.cput.service.employee.impl;
import ac.za.cput.domain.employee.Employee;
import ac.za.cput.repository.employee.EmployeeRepository;
import ac.za.cput.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    private final EmployeeRepository repository;
   @Autowired
   public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee save(Employee employee) {
        return this.repository.save(employee);   }

    @Override
    public Optional<Employee> read(String s) {return this.repository.findById(s);}


    @Override
    public void delete(Employee s) {
        repository.delete(s);

    }

    public Optional <Employee> findNameByEmail(String email) {
     return repository.findNameByEmail(email);
    }

    @Override
    public Set<Employee> findAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());    }
}
