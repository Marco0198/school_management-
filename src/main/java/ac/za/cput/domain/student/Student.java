package ac.za.cput.domain.student;
import ac.za.cput.domain.name.Name;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/

@Entity
@Table(name="student")
public class Student {
    @Id
    @NotNull private String studentId;
    @NotNull private String  email;
    @Embedded
    private Name name;
    public Name getName() {return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name+
                '}';
    }

    public Student(Builder builder) {
        this.studentId= builder.studentId;
        this.name= builder.name;
        this.email= builder.email;

    }
    public Student() {}

    public String getStudentId() {return studentId;}
    public String getStudentEmail() {return email;}


    public static class Builder{
        @Id
        private String studentId;
        private Name name;

        private String  email;

        public Builder setStudentId(String studentId){
            this.studentId= studentId;
            return this;
        }

        public  Builder setName(Name name) {
            this.name = name;
            return this;
        }
        public Builder setEmail(String email){
            this.email= email;
            return this;
        }

        public Builder copy(Student student){

            this.studentId=student.studentId;
            this.email=student.email;
            this.name=student.name;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}








