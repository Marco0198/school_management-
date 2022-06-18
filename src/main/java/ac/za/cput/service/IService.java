package ac.za.cput.service;
import java.util.Optional;
/*
 Author: Marco Mulondayi Tshimanga (219049505)
 Date:  2022
*/
public interface IService<T, ID> {
    T save(T t);
    Optional<T> read(ID id);
    void delete(T id);
}
