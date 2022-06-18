package ac.za.cput.service.country;

import ac.za.cput.domain.country.Country;
import ac.za.cput.service.IService;

import java.util.List;

public interface CountryService extends IService<Country, String>
{

    List<Country> findAll();
}
