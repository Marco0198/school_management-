package ac.za.cput.factory.student;

import ac.za.cput.domain.name.Name;
import ac.za.cput.domain.student.Student;
import ac.za.cput.helper.StringHelper;

public class StudentFactory {
    public static Student createStudent(String studentId, String email, Name name){

        StringHelper.checkStringParam("studentId",studentId);
        StringHelper.checkStringParam("email",email);
        StringHelper.checkStringParam("firstname",name.firstName);
        StringHelper.checkStringParam("lastname",name.lastName);
        StringHelper.checkStringParam("middle name",name.middleName);
        return new Student.Builder().setStudentId(studentId).setEmail(email).setName(name).build();
    }
}
