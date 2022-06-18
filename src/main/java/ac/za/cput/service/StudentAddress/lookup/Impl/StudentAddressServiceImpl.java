/* StudentAddressServiceImpl.java
   Service for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package ac.za.cput.service.StudentAddress.lookup.Impl;

import ac.za.cput.domain.StudentAddress.StudentAddress;
import ac.za.cput.repository.StudentAddress.StudentAddressRepository;
import ac.za.cput.service.StudentAddress.lookup.StudentAddressService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentAddressServiceImpl implements StudentAddressService {

    private StudentAddressServiceImpl(StudentAddressRepository repository){
    }

    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        return null;
    }

    @Override
    public Optional<StudentAddress> read(String s) {
        return Optional.empty();
    }

    @Override
    public void delete(StudentAddress id) {

    }

    @Override
    public List<StudentAddress> findAll() {
        return null;
    }
}
