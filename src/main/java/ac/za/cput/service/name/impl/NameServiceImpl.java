package ac.za.cput.service.name.impl;
/*
NameServiceImpl.java
Implementation for NameService interface
@author: Anicka Schouw 217284183
June 2022
 */
import ac.za.cput.domain.name.Name;
import ac.za.cput.repository.name.NameRepository;
import java.util.Set;
import java.util.stream.Collectors;

public class NameServiceImpl {

    private NameRepository repository;

    public Set<Name> readAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    public Name save(Name name) {
        return  this.repository.save(name);
    }

    public Name readOne(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    public void delete(Name name) {
        this.repository.delete(name);
    }

}
