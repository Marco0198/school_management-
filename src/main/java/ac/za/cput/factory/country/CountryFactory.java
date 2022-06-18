package ac.za.cput.factory.country;

/*
 * Student Name : Devon Sherwyn May
 * Student Number : 219168296
 * Date : 18th June 2022
 * CountryFactory.java
 * */

import ac.za.cput.domain.country.Country;
import ac.za.cput.helper.StringHelper;

public class CountryFactory
{
    public static Country build(String id, String name)
    {

        StringHelper.checkStringParam("id", id);
        StringHelper.checkStringParam("name", name);
        return new Country.Builder().id(id).name(name).build();
    }

}
