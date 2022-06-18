package ac.za.cput.controller.country;

import ac.za.cput.domain.country.Country;
import ac.za.cput.factory.country.CountryFactory;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;


/*Student Name - Devon May
Student Number - 219168296
Date - 18 June 2022
CountryControllerTest
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
class CountryControllerTest {
    private static Country country;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseUrl;

    @BeforeEach
    void setUp() {
        this.country = CountryFactory.build("ZA", "South Africa");
        this.baseUrl = "http://localhost:" + this.port + "/country";
    }

    @Test
    void a_save() {
        String url = baseUrl + "/save";
        ResponseEntity<Country> postResponse = restTemplate.postForEntity(url, country, Country.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        country = postResponse.getBody();
        assertEquals(country.getId(), postResponse.getBody().getId());

    }

    @Test
    void b_read() {
        String url = baseUrl + "/read/" + country.getId();
        System.out.println("URL: " + url);
        ResponseEntity<Country> response = restTemplate.getForEntity(url, Country.class);
        assertNotNull(response);
    }

    @Test
    void c_delete() {
        String url = baseUrl + "/delete/" + country.getId();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }
}
