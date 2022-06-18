package ac.za.cput.domain.employee;
import ac.za.cput.domain.name.Name;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @NotNull
    @Column(name="staff_id")
    private String staffId;
    @Column(name="email")
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE)
    @NotEmpty(message = "Email cannot be empty")
    @NotNull private String  email;
    @Embedded
    private Name name;
    public Name getName() {return name;
    }

    public Employee(Builder builder) {
        this.staffId= builder.staffId;
        this.name= builder.name;
        this.email= builder.email;
    }
    public Employee() {}

    public String getStaffId() {return staffId;}
    public String getEmail() {return email;}

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    public static class Builder{
        @Id
        private String staffId;
        @Embedded
        private Name name;
        private String  email;

        public Builder setStaffId(String staffId){
            this.staffId= staffId;
            return this;
        }

        public Builder  setName(Name name) {
            this.name = name;
            return this;
        }
        public Builder setEmail(String email){
            this.email= email;
            return this;
        }

        public Builder copy(Employee employee){

            this.staffId=employee.staffId;
            this.email=employee.email;
            this.name=employee.name;

            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}








