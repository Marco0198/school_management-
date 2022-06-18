package ac.za.cput.service.city.impl;

import ac.za.cput.domain.city.City;
import ac.za.cput.domain.country.Country;
import ac.za.cput.factory.city.CityFactory;
import ac.za.cput.factory.country.CountryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * CityServiceImplTest.java
 * Date : 13th June 2022
 */

@SpringBootTest
class CityServiceImplTest {
    @Autowired
    public CityServiceImpl service;
    public City city1;
    public Country country1;
    @BeforeEach
    void setUp() {
        this.city1 = CityFactory.build("7500","Cape Town", country1);
        this.country1 = CountryFactory.build("2000", "South Africa");
    }

    @Test
    void  save() {
        City city = this.service.save(this.city1);
        System.out.println(city.toString());
        assertNotNull(city);
    }

    @Test
    void read() {
        City city = this.service.save(this.city1);
        Optional<City> read = this.service.read(city1.getId());
        assertAll(()->assertTrue(read.isPresent()));
    }


    void delete() {
        this.service.delete(this.city1);
        Set<City> cityList = this.service.findAll();
        assertEquals(0,cityList.size());
    }

    @Test
    void findAll() {
        this.service.save(this.city1);
        Set<City> cityList = this.service.findAll();
        assertEquals(1,cityList.size());
    }
}