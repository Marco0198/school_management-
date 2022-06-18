package ac.za.cput.factory.city;

import ac.za.cput.domain.city.City;
import ac.za.cput.domain.country.Country;
import ac.za.cput.helper.StringHelper;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * CityFactory.java
 * Date : 13th June 2022
 */

public class CityFactory {
    public static City build(String id, String cityName, Country country){

        StringHelper.checkStringParam("name", cityName);
        StringHelper.checkStringParam("id", id);

        return new City.Builder()
                .setId(id)
                .setName(cityName)
                .setCountry(country)
                .build();
    }
}
