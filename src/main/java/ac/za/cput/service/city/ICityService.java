package ac.za.cput.service.city;

import ac.za.cput.domain.city.City;
import ac.za.cput.service.IService;
import java.util.Set;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * ICityService.java
 * Date : 13th June 2022
 */

public interface ICityService extends IService<City, String> {
    Set<City> findAll();
}
