package ac.za.cput.service.country.Impl;

import ac.za.cput.domain.country.Country;
import ac.za.cput.repository.country.CountryRepository;
import ac.za.cput.service.country.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Student Name : Devon Sherwyn May
 * Student Number : 219168296
 * Date : 18th June 2022
 * CountryServiceImpl.java
 * */
@Service
public class CountryServiceImpl implements CountryService
{
    private final CountryRepository repository;

    private CountryServiceImpl(CountryRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public Country save(Country country)

    {
        return this.repository.save(country);
    }

    @Override
    public Optional<Country> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(Country country) {this.repository.delete(country);}

    @Override
    public List<Country> findAll() {
        return this.repository.findAll();
    }
}

