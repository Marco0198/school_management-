package ac.za.cput.domain.employee;
import ac.za.cput.domain.name.Name;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
public class Employee {
    @Id
    @NotNull
    private String staffId;
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

            this.staffId=staffId;
            this.email=email;
            this.name=name;

            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}








