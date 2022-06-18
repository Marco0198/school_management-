package ac.za.cput.controller.student;

import ac.za.cput.domain.student.Student;
import ac.za.cput.service.student.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;
import java.util.Set;

@RestController
@Slf4j

public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("student/list")
    public ResponseEntity<Set<Student>> list(){
        Set<Student> student=this.service.findAll();
        return  ResponseEntity.ok(student);
    }
    @GetMapping("student/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student>read ( @PathVariable String id){
        log.info("read request :{}",id);
        Student student =service.read(id).orElseThrow(()-> {
            return new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
        return ResponseEntity.ok(student);
    }

    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student save ( @RequestBody Student student){
        return service.save(student);
    }

    private Optional<Student>getById(String id){
        return this.service.read(id);
    }




}