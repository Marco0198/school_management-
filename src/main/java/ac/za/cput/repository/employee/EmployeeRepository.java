package ac.za.cput.repository.employee;
import ac.za.cput.domain.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Optional<Employee> findNameByEmail (String email);
}
