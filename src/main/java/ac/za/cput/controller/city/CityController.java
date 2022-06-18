package ac.za.cput.controller.city;

import ac.za.cput.domain.city.City;
import ac.za.cput.service.city.impl.CityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.Set;

/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * CityController.java
 * Date : 13th June 2022
 *
 */
@RestController
@Slf4j
public class CityController {
    @Autowired
    private CityServiceImpl service;
    @GetMapping("city/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<City> findNameById (@PathVariable String id) {
        log.info("read request :{}",id);
        City city = service.findNameById(id).orElseThrow(()-> {
            return new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
        return ResponseEntity.ok(city);
    }
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<City> listAllCities (@PathVariable String countryId) {
        log.info("read request :{}", countryId);
        City city = service.listAllCities(countryId).orElseThrow(()-> {
            return new ResponseStatusException(HttpStatus.NO_CONTENT);
        });
        return ResponseEntity.ok(city);
    }

    @GetMapping("/")
    public String index() {
        return "Welcome!";
    }

    @GetMapping("city/list")
    public ResponseEntity<Set<City>> list(){
        Set<City> city = this.service.findAll();
        return  ResponseEntity.ok(city);
    }
}
