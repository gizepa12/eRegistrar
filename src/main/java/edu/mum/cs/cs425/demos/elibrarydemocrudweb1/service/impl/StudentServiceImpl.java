package edu.mum.cs.cs425.demos.elibrarydemocrudweb1.service.impl;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb1.model.Student;
import edu.mum.cs.cs425.demos.elibrarydemocrudweb1.repository.StudentRepository;
import edu.mum.cs.cs425.demos.elibrarydemocrudweb1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Iterable<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return repository.findById(studentId).orElse(null);
    }

    @Override
    public void deleteStudentById(Integer studentId) {
        repository.deleteById(studentId);
    }

}
