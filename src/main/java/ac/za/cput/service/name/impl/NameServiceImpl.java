package ac.za.cput.service.name.impl;
/*
NameServiceImpl.java
Implementation for NameService interface
@author: Anicka Schouw 217284183
June 2022
 */
import ac.za.cput.domain.name.Name;
import ac.za.cput.repository.name.NameRepository;
import ac.za.cput.repository.student.StudentRepository;
import ac.za.cput.service.name.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NameServiceImpl implements NameService {

    @Autowired
    private NameRepository repository;

    public NameServiceImpl(NameRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Name> readAll() {
        return this.repository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public Name save(Name name) {
        return  this.repository.save(name);
    }

    @Override
    public Optional<Name> read(String s) {
        return Optional.empty();
    }

    @Override
    public Name readOne(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public void delete(Name name) {
        this.repository.delete(name);
    }

}
