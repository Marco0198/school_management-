package ac.za.cput.service.student.impl;

import ac.za.cput.domain.student.Student;
import ac.za.cput.repository.student.StudentRepository;
import ac.za.cput.service.student.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
 public class StudentServiceImpl implements StudentService {
 private final StudentRepository repository;
 @Autowired
 public StudentServiceImpl(StudentRepository repository) {
     this.repository = repository;
 }
 @Override
 public Student save(Student student){
     return this.repository.save(student);
 }
 @Override
 public Optional<Student> read(String studentId) {
     return this.repository.findById(studentId);
 }

 @Override
 public void delete(Student s) {repository.delete(s);}
    @Override
 public Set<Student> findAll() {
     return this.repository.findAll().stream().collect(Collectors.toSet());
 }
}
