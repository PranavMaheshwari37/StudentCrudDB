package StudentCrudDB.example.StudentCrudDB.service;

import StudentCrudDB.example.StudentCrudDB.model.Student;

import java.util.List;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Integer id);

    Student updateStudent(Integer id, Student updatedStudent);

    void deleteStudent(Integer id);
}
