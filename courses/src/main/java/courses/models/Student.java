package courses.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String studentName;

    private String classCode;

    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Teacher> teachers = new ArrayList<>();

//    @ManyToMany(mappedBy = "students",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    private List<Lesson> lessons = new ArrayList<>();


}
