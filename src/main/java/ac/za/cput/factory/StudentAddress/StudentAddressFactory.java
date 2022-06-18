/* StudentAddressFactory.java
   Factory for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package ac.za.cput.factory.StudentAddress;

import ac.za.cput.domain.StudentAddress.Address;
import ac.za.cput.domain.StudentAddress.StudentAddress;
import ac.za.cput.helper.StringHelper;

public class StudentAddressFactory {
    public static StudentAddress build(String studentId, Address address)
    {
        StringHelper.checkStringParam("214234169",studentId);

        if (address == null)
            throw new IllegalArgumentException("Address Field Cannot Be Empty");

        return new StudentAddress.Builder().studentId(studentId).address(address).build();
    }
}
