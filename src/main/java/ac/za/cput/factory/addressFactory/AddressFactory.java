/*
Klaus Traubner
218009496
13 June 2022
ADP372S
 */
package Factory;

import Domain.Address;

public class AddressFactory
{
    public static Address build(String unitNumber, String complexName, String streetNumber, String streetName, int postalCode)
    {

        if(streetName.isEmpty())
            throw new IllegalArgumentException("StreetName cannot be empty");
        return new Address.Builder().unitNumber(unitNumber).complexName(complexName).streetName(streetName).streetNumber(streetNumber).postalCode(postalCode).build();

    }
}
