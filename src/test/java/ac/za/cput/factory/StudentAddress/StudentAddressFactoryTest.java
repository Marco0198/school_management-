/* StudentAddressFactoryTest.java
   Factory Test for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package ac.za.cput.factory.StudentAddress;

import ac.za.cput.domain.StudentAddress.Address;
import ac.za.cput.domain.StudentAddress.StudentAddress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {
    @Test
    public void StudentAddressPass(){
        Address address = new Address();
        StudentAddress studentAddress = StudentAddressFactory.build("214234169",
                address);
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

    @Test
    public void StudentIdTestFail(){
        Address address = new Address();
        StudentAddress studentAddress = StudentAddressFactory.build("",
                address);
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

    @Test
    public void StudentAddressTestFail(){
        Address address = new Address();
        StudentAddress studentAddress = StudentAddressFactory.build("214234169",null);
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

}