package ac.za.cput.repository.student;
import ac.za.cput.domain.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
