package ac.za.cput.factory.student;
import ac.za.cput.domain.name.Name;
import ac.za.cput.domain.student.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
class StudentFactoryTest {

    @Test
    void createStudent() {
        Name name= new Name("marco","mulonday","tshimanga");
        Student student = StudentFactory.createStudent("888","788",name);
        System.out.println(student.toString());
        assertNotNull(student);
    }
}