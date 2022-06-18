package ac.za.cput.service.city.impl;

import ac.za.cput.domain.city.City;
import ac.za.cput.repository.city.CityRepository;
import ac.za.cput.service.city.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * CityServiceImpl.java
 * Date : 13th June 2022
 */
@Service
public class CityServiceImpl implements ICityService {
    private final CityRepository repository;
    @Autowired
    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }
    @Override
    public City save(City city) {
        return this.repository.save(city);
    }
    @Override
    public Optional<City> read(String id) {
        return this.repository.findById(id);
    }

    @Override
    public void delete(City c) {
        repository.delete(c);
    }

    public Optional <City> findNameById(String id) {
        return repository.findNameById(id);
    }

    @Override
    public Set<City> findAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
