package ac.za.cput.repository.student;
import ac.za.cput.domain.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
StudentRepository.java
Repository interface for domain Student
@author: Anicka Schouw 217284183
June 2022
*/
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
