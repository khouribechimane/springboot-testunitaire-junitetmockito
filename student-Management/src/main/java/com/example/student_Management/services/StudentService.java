package com.example.student_Management.services;

import com.example.student_Management.entities.Student;
import com.example.student_Management.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save a student
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    // Delete a student by ID
    public boolean delete(int id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            studentRepository.delete(studentOptional.get());
            return true;
        } else {
            return false;
        }
    }

    // Find all students
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // Count the number of students
    public long countStudents() {
        return studentRepository.count();
    }

    // Find the number of students by year of birth
    public Collection<?> findNbrStudentByYear() {
        return studentRepository.findNbrStudentByYear();
    }
}
