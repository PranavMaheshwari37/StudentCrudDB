package StudentCrudDB.example.StudentCrudDB.repository;

import StudentCrudDB.example.StudentCrudDB.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
