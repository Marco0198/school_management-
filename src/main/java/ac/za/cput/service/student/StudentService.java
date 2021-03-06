package ac.za.cput.service.student;
import ac.za.cput.domain.student.Student;
import ac.za.cput.service.IService;
import java.util.Set;
/*
StudentService.java
Service Interface for domain Student
@author: Anicka Schouw 217284183
June 2022
*/
public interface StudentService extends IService<Student,String> {
    Set<Student> findAll();
}