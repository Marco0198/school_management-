package ac.za.cput.repository.StudentAddress;

import ac.za.cput.domain.StudentAddress.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAddressRepository extends JpaRepository<StudentAddress,String> {
}
