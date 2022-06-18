package ac.za.cput.service.student;
import ac.za.cput.domain.student.Student;
import ac.za.cput.service.IService;
import java.util.Set;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
public interface StudentService extends IService<Student,String> {
    Set<Student> findAll();
}