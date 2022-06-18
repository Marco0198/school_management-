/*
Klaus Traubner
218009496
16 June 2022
AddressFactoryTest.java
 */

package ac.za.cput.factory.address;

import ac.za.cput.domain.address.Address;
import ac.za.cput.domain.city.City;
import ac.za.cput.domain.country.Country;
import ac.za.cput.factory.city.CityFactory;
import ac.za.cput.factory.country.CountryFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressFactoryTest {
// test should pass
    @Test
    public void createAddressTestPass()
    {
       Country country = CountryFactory.build("ZA", "South Africa");
       City city= CityFactory.build("996", "CPT", country);
       Address address =AddressFactory.Builder("44","BMC", "Rhodes Memorial", "34A", 8001, city);
        System.out.println(address.toString());
        assertNotNull(address);
    }
// test should fail
    @Test
    void readAddressTestUnitNumberFail()
    {
        Country country = CountryFactory.build("UK", "United Kingdom");
        City city= CityFactory.build("786", "London", country);
        Address address =AddressFactory.Builder("","Sunrise Court", "Foundation Street", "60AC", 7382, city);
        System.out.println(address.toString());
        assertNotNull(address);
    }
// test should fail
    @Test
    void updateAddressStreetNameTestFail()
    {
        Country country = CountryFactory.build("US", "United States");
        City city= CityFactory.build("5", "Illinois", country);
        Address address =AddressFactory.Builder("48","Cougar Meadows", "", "13B", 4763, city);
        System.out.println(address.toString());
        assertNotNull(address);
    }

}
