package ac.za.cput.repository.city;

import ac.za.cput.domain.city.City;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * CityRepository.java
 * Date : 13th June 2022
 */
public interface CityRepository extends JpaRepository<City, String> {
    Optional<City> findNameById (String id);
}
