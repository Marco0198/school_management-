package ac.za.cput.factory.country;

import ac.za.cput.domain.country.Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*Student Name - Devon May
Student Number - 219168296
Date - 18 June 2022
CountryFactoryTest
 */

class CountryFactoryTest
{
    @Test
    public void CountryTestPass()
    {
        Country country = CountryFactory.build("ZAR", "South Africa");
        System.out.println(country);
        assertNotNull(country);
    }

    @Test
    public void CountryIdTestFail()
    {
        Country country = CountryFactory.build("", "South Africa");
        System.out.println(country);
        assertNotNull(country);
    }

    @Test
    public void CountryNameTestFail() {
        Country country = CountryFactory.build("ZAR", "");
        System.out.println(country);
        assertNotNull(country);
    }
}