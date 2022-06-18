package ac.za.cput.factory.student;
import ac.za.cput.domain.name.Name;
import ac.za.cput.domain.student.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
StudentFactoryTest.java
The test case for Student Factory
@author: Anicka Schouw 217284183
June 2022
*/
class StudentFactoryTest {

    @Test
    void createStudent() {
        Name name= new Name("Anicka","Maggie","Schouw");
        Student student = StudentFactory.createStudent("010","685",name);
        System.out.println(student.toString());
        assertNotNull(student);
    }

    @Test
    void createStudentWithError() {
        Name name= new Name("","Maggie","Schouw");
        Student student = StudentFactory.createStudent("010","685",name);
        System.out.println(student.toString());
        assertNotNull(student);
    }
}