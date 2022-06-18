package ac.za.cput.service.student.impl;
import ac.za.cput.domain.name.Name;
import ac.za.cput.domain.student.Student;
import ac.za.cput.factory.student.StudentFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import java.util.Set;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceImplTest {
    @Autowired public StudentServiceImpl service;
    public Name name;
    public Student student1;
    @BeforeEach
    void setUp() {
        this.name= new Name("marco","mulonday","tshimanga");
        this.student1= StudentFactory.createStudent("44","thh@gmail.com",this.name);
    }

    @Test
    void  save() {

       Student student =this.service.save(this.student1);
        System.out.println(student.toString());
        assertNotNull(student);
        // assertSame(this.employee1,employee);
    }

    @Test
    void read() {
        Student student =this.service.save(this.student1);
        Optional<Student> read= this.service.read(student.getStudentId());
        assertAll(()->assertTrue(read.isPresent()));
    }


    @Test
    void delete() {
        this.service.delete(this.student1);
        Set<Student> studentList= this.service.findAll();
        assertEquals(0,studentList.size());

    }

    @Test
    void findAll() {
        this.service.save(this.student1);
        Set<Student> studentList= this.service.findAll();
        assertEquals(1,studentList.size());

    }
}