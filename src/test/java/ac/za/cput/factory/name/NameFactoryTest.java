package ac.za.cput.factory.name;
/*
NameFactoryTest.java
Test factory for domain name
@author: Anicka Schouw 217284183
June 2022
 */

import ac.za.cput.domain.name.Name;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NameFactoryTest {

    @Test
    @Order(1)
        //This test should pass
    void createNameWithMiddleName(){
        var name = NameFactory.build("Anicka", "Maggie","Schouw");

        assertEquals("Anicka",name.getFirstName());
        assertEquals("Maggie",name.getMiddleName());
        assertEquals("Schouw",name.getLastName());
        System.out.println("Test passed!");
    }

    @Test
    @Order(2)
        //This test should pass
    void createNameWithNoMiddleName(){
        var name = NameFactory.build("Aneeqah","","Abrahams");

        assertEquals("Aneeqah",name.getFirstName());
        assertEquals("",name.getMiddleName());
        assertEquals("Abrahams",name.getLastName());
        System.out.println("Test passed with no middle name!");
    }

    @Test
    @Order(3)
        //This test should fail
    void testWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                NameFactory.build("","",""));
        System.out.println(exception.getMessage()+", Test failed! need to have a first name and last name");
        assertTrue(exception.getMessage().contains("middleName"));
    }

}