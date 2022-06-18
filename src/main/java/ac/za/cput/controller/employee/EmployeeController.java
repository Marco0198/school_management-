package ac.za.cput.controller.employee;
import ac.za.cput.domain.employee.Employee;
import ac.za.cput.service.employee.impl.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.Set;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
@RestController
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl service;
    @GetMapping("employee/{email}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Employee> findNameByEmail (@PathVariable String email){
        log.info("read request :{}",email);
        Employee employee =service.findNameByEmail(email).orElseThrow(()-> {
            return new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
        return ResponseEntity.ok(employee);
    }
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @GetMapping("employee/list")
    public ResponseEntity<Set<Employee>> list(){
        Set<Employee> student=this.service.findAll();
        return  ResponseEntity.ok(student);
    }
}
