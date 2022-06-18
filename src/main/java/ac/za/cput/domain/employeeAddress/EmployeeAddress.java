package ac.za.cput.domain.employeeAddress;

import ac.za.cput.domain.address.Address;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * EmployeeAddress.java
 * Date : 13th June 2022
 */

@Embeddable
public class EmployeeAddress implements Serializable {
    @NotNull
    @EmbeddedId
    public String staffId;
    @Embedded
    @NotNull
    public Address address;

    protected EmployeeAddress(){}

    private EmployeeAddress(Builder builder) {
        this.staffId = builder.staffId;
        this.address = builder.address;
    }

    public String getStaffId() {
        return staffId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Builder {
        public String staffId;
        public Address address;

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(EmployeeAddress employeeAddress) {
            this.staffId = employeeAddress.staffId;
            this.address = employeeAddress.address;
            return this;
        }

        public EmployeeAddress build() {
            return new EmployeeAddress(this);
        }
    }
}
