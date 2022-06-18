package ac.za.cput.factory.city;

import ac.za.cput.domain.city.City;
import ac.za.cput.domain.country.Country;
import ac.za.cput.factory.country.CountryFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * CityFactoryTest.java
 * Date : 13th June 2022
 */
class CityFactoryTest {
    // Test should fail
    @Test
    public void CityIDTestShouldFail()
    {
        Country country = CountryFactory.build("ZAR", "South Africa");
        City city = CityFactory.build("", "Johannesburg",country);
        System.out.println(city.toString());
        assertNotNull(city);
    }

    // Test should fail
    @Test
    public void CityNameTestShouldFail()
    {
        Country country = CountryFactory.build("ZAR", "South Africa");
        City city = CityFactory.build("1234", "",country);

        List<City> allCities = new ArrayList<>();

        System.out.println(city.toString());
        assertNotNull(city);
    }

    // Test should pass
    @Test
    public void CityTestShouldPass()
    { Country country = CountryFactory.build("ZAR", "South Africa");
        City city = CityFactory.build("1234", "Cape Town",country);
        System.out.println(city.toString());
        assertNotNull(city);
    }
}