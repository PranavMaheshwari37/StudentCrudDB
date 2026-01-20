package StudentCrudDB.example.StudentCrudDB.controller;

import StudentCrudDB.example.StudentCrudDB.exception.StudentNotFoundException;
import StudentCrudDB.example.StudentCrudDB.model.Student;
import StudentCrudDB.example.StudentCrudDB.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    @PostMapping
    public Student addStudent(@Valid @RequestBody Student student) {
        return studentRepository.save(student);
    }

    // READ ALL
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable Integer id,
            @Valid @RequestBody Student updatedStudent) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));

        student.setName(updatedStudent.getName());
        return studentRepository.save(student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));

        studentRepository.delete(student);
        return "Student deleted with id: " + id;
    }
}
