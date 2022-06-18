package ac.za.cput.service.country.impl;

import ac.za.cput.SchoolManagementApplication;
import ac.za.cput.domain.country.Country;
import ac.za.cput.factory.country.CountryFactory;
import ac.za.cput.service.country.CountryService;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest(classes= SchoolManagementApplication.class)
class CountryServiceImplTest {
    private Country country, saved;
    @Autowired
    private CountryService service;

    @BeforeEach
    void setUp() {
        this.country = CountryFactory.build("ZA", "South Africa");
        this.saved = service.save(this.country);
    }

    @Test
    void a_save() {
        this.country = CountryFactory.build("Au", "Australia");
        this.saved = service.save(this.country);
        System.out.println(saved);
        assertNotNull(saved);
    }

    @Test
    void b_read() {
        Optional<Country> read = this.service.read(country.getId());
        System.out.println(read);
    }

    @Test
    void c_delete() {
        this.service.delete(this.country);
        List<Country> countryList = this.service.findAll();
        assertEquals(1, countryList.size());
        System.out.println("Final List after delete: " + countryList);
        System.out.println("Successfully deleted: " + this.country);
    }

    @Test
    void d_findAll()
    {
        this.service.save(this.country);
        List<Country> countryList= this.service.findAll();
        assertEquals(2,countryList.size());
        System.out.println(countryList);

    }
}

