package ac.za.cput.repository.country;


/* Student Name : Devon Sherwyn May
 * Student Number : 219168296
 * Date : 18th June 2022
 * CountryRepository.java
 */

import ac.za.cput.domain.country.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,String>
{
    @Override
    List<Country> findAll();
}
