package courses.service;

import courses.models.Student;
import courses.repository.StudentRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class StudentService {


    //Burada autowired eklemeden private final yapıp constructrua geçtik ama hata veriyor sor evren abiye
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student){
        return  studentRepository.save(student);
    }

    public List<Student> findAllStudent(){
        return studentRepository.findAll();
    }


    //Burada optinal yazmadan hata veriyor nedenini sor evren abiye
    public Optional<Student> findByStudentId(Integer studentId){
        return  studentRepository.findById(studentId);
    }

}
