package ac.za.cput.service.name.impl;
/*
NameServiceImplTest.java
Test case for Name Service Implementation
@author: Anicka Schouw 217284183
June 2022
 */

import ac.za.cput.domain.name.Name;
import ac.za.cput.factory.name.NameFactory;
import ac.za.cput.service.name.NameService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
/*
@SpringBootTest
@TestMethodOrder(MethodOrderer.class)
class NameServiceImplTest {

    @Autowired private NameService service;
    private Name name;

    @BeforeEach
    void setUp(){
        this.name = NameFactory.build("Mohammad", "Ra'ees", "Abrahams");
    }

    @Test
    @Order(3)
    void readAll() {
        List<Name> nameList = service.readAll();
        assertEquals(1,nameList.size());
    }

    @Test
    @Order(1)
    void save() {
        Name created = service.save(name);
        assertEquals(name.getFirstName(),created.getFirstName());
    }

    @Test
    @Order(2)
    void readOne() {
        Name created = service.readOne(name.getFirstName());
        assertEquals(name.getFirstName(),created.getFirstName());
    }

    @Test
    @Order(4)
    void delete() {
        service.delete(name);
        assertEquals(0,service.readAll().size());
    }
}

 */