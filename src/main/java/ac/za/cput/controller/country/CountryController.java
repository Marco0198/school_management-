package ac.za.cput.controller.country;


import ac.za.cput.domain.country.Country;
import ac.za.cput.factory.country.CountryFactory;
import ac.za.cput.service.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/*Student Name - Devon May
Student Number - 219168296
Date - 18 June 2022
CountryController
 */
@RestController
@RequestMapping("/country")
public class CountryController
{

    @Autowired
    private CountryService countryService;

    private Optional<Country> getById(String id)
    {
        return  this.countryService.read(id);
    }

    @PostMapping("/create")
    public Country create(@RequestBody Country country)
    {
        Country newCountry = CountryFactory.build("ZA","South Africa");
        return countryService.save(newCountry);
    }

    @GetMapping("/read/{id}")
    public Optional<Country> read(@PathVariable String id){return countryService.read(id);}

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id)
    {
        Optional<Country> country =getById(id);
        if(country.isPresent())
        {
            this.countryService.delete(country.get());
        }
        return ResponseEntity.noContent().build();
    }

}
