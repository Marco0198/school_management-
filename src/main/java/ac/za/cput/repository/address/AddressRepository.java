/*
Klaus Traubner
218009496
18 June 2022
AddressRepository.java
 */

package ac.za.cput.repository.address;

import ac.za.cput.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository <Address, String> {
}
