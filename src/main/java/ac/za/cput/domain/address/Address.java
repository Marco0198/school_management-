/*
        Klaus Traubner
        218009496
        13 June 2022
        Address.java
*/
package ac.za.cput.domain.address;

import ac.za.cput.domain.city.City;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address  {

    private String unitNumber;
    private String complexName, streetNumber, streetName;
    private int postalCode;

    protected Address() {}

    @Embedded
    public City city;

    private Address(Builder builder) {
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.city = builder.city;

    }

    public static class Builder {
        public String unitNumber;
        public String complexName;
        public String streetNumber;
        public String streetName;
        public int postalCode;

        public City city;

        public Builder setUnitNumber(String unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder setComplexName(String complexName) {
            this.complexName = complexName;
            return this;
        }

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCity (City city) {
            this.city = city;
            return this;
        }

        public Builder copy(Address address) {
            this.unitNumber = address.unitNumber;
            this.streetNumber = address.streetNumber;
            this.complexName = address.complexName;
            this.postalCode = address.postalCode;
            this.streetName = address.streetName;
            this.city = address.city;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "unitNumber='" + unitNumber + '\'' +
                    ", complexName='" + complexName + '\'' +
                    ", streetNumber='" + streetNumber + '\'' +
                    ", streetName='" + streetName + '\'' +
                    ", postalCode=" + postalCode +
                    ", city=" + city +
                    '}';
        }

        public Address build() {
            return new Address(this);
        }
    }


}
