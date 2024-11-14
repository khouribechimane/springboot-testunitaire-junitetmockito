package com.example.student_Management.repositories;

import com.example.student_Management.entities.Student;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // Find a student by their ID
    Optional<Student> findById(Integer id);

    // Custom query to count students by year of birth
    @Query("SELECT YEAR(s.dateNaissance), COUNT(s) FROM Student s GROUP BY YEAR(s.dateNaissance)")
    Collection<Object> findNbrStudentByYear();
}
