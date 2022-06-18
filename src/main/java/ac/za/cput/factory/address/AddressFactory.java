/*
Klaus Traubner
218009496
18 June 2022
AddressFactory.java
 */

package ac.za.cput.factory.address;

import ac.za.cput.domain.address.Address;
import ac.za.cput.domain.city.City;
import ac.za.cput.helper.StringHelper;

public class AddressFactory {
    public static Address Builder
            (String unitNumber, String complexName, String streetName, String streetNumber, int postalCode, City city) {

        StringHelper.checkStringParam("unitNumber", unitNumber);
        StringHelper.checkStringParam("complexName", complexName);
        StringHelper.checkStringParam("streetName", streetName);
        StringHelper.checkStringParam("streetNumber", streetNumber);
        //StringHelper.checkStringParam("postalCode", postalCode); //int
        //StringHelper.class(City);

        return new Address.Builder()
                .setUnitNumber(unitNumber)
                .setComplexName(complexName)
                .setStreetName(streetName)
                .setStreetNumber(streetNumber)
                .setPostalCode(postalCode)
                .setCity(city)
                .build();

    }
}
