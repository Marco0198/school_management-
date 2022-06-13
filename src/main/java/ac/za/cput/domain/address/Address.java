/*
Klaus Traubner
218009496
13 June 2022
ADP372S
 */


package Domain;

public class Address {
    private final String unitNumber,complexName, streetNumber,streetName;
    private final int postalCode;

    private Address(Builder builder)

    {
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;

    }

    public String getUnitNumber() {return unitNumber;}
    public String getComplexName() {return complexName;}
    public String getStreetNumber() {return streetNumber;}
    public String getStreetName() {return streetName;}
    public int getPostalCode() {return postalCode;}

    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" +  streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + '\'' +
                '}';
    }

    public static class Builder
    {
        private String unitNumber, complexName, streetNumber , streetName;
        private int postalCode;

        public Builder unitNumber(String unitNumber)
        {
            this.unitNumber=unitNumber;
            return this;
        }

        public Builder complexName(String complexName)
        {
            this.complexName=complexName;
            return this;
        }

        public Builder streetNumber(String streetNumber)
        {
            this.streetNumber=streetNumber;
            return this;
        }

        public Builder streetName(String streetName)
        {
            this.streetName=streetName;
            return this;
        }

        public Builder postalCode(int postalCode)
        {
            this.postalCode=postalCode;
            return this;
        }


        public Address build()
        {
            return new Address(this);
        }

    }
}
