/* StudentAddressServiceImpl.java
   Service Interface for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package ac.za.cput.service.StudentAddress.lookup;

import ac.za.cput.domain.StudentAddress.StudentAddress;
import ac.za.cput.service.IService;

import java.util.List;

public interface StudentAddressService extends IService<StudentAddress, String>
{
    List<StudentAddress> findAll();
}
