/* StudentAddress.java
   Domain for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package ac.za.cput.domain.StudentAddress;

import com.sun.istack.NotNull;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class StudentAddress implements Serializable{
    @NotNull @Id private String studentId;
    @NotNull @Embedded private Address address;

    protected StudentAddress(){}

    private StudentAddress (Builder builder)
    {
        this.studentId = builder.studentId;
        this.address = builder.address;
    }

    public String getStudentId(){return studentId;}
    public  Address getAddress(){return address;}

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder
    {
        private String studentId;
        private Address address;

        public Builder studentId(String studentId)
        {
            this.studentId=studentId;
            return this;
        }
        public Builder address(Address address)
        {
            this.address=address;
            return this;
        }

        public Builder copy(StudentAddress studentAddress) {
            this.studentId = studentAddress.studentId;
            this.address = studentAddress.address;

            return this;
        }

        public StudentAddress build(){return new StudentAddress(this);}
    }
}
