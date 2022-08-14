package courses.controller;


import courses.models.Student;
import courses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        super();
        this.studentService = studentService;
    }


    @PostMapping("/save")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student addStudent =studentService.addStudent(student);
        return new ResponseEntity<Student>(addStudent, HttpStatus.CREATED);
    }

}
