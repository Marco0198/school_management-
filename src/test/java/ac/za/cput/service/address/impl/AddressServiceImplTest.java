///*
//Klaus Traubner
//218009496
//AddressServiceImplTest.java
//18 June 2022
// */
//
//package ac.za.cput.service.address.impl;
//import ac.za.cput.domain.address.Address;
//import ac.za.cput.domain.city.City;
//import ac.za.cput.factory.address.AddressFactory;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
// class AddressServiceImplTest{
//
//    @Autowired public AddressServiceImpl service;
//
//    public Address address1;
//
//    @BeforeEach
//    void setUp(){
//   //    this.address1 = AddressFactory.Builder
//     //          ("S2", "Solomun Block","Silvia", "180SX", 3000, new City());
//    }
//
//   @Test
//   void update() {}
//
//   @Test
//    void save () {
//     // Address address = this.service.save(this.address1);
//     // System.out.println(address.toString());
//     // assertNotNull(address);
//    }
//
//    @Test
//    void read() {
//      // Address address = this.service.save(this.address1);
//      // Optional<Address> read = this.service.read(address.toString());
//      // assertAll(()->assertTrue(read.isPresent()));
//    }
//
//
//    @Test
//    void delete() {
//
//    //   this.service.delete(this.address1);
//     //  Set<Address> addressSet = this.service.findAll();
//     //  assertEquals(0, addressSet.size());
//    }
//
//    @Test
//   void findAll(){
//      // this.service.save(this.address1);
//       //assertEquals(1, addressSet.size());
//    }
//
//}
