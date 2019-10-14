package edu.mum.cs.cs425.demos.elibrarydemocrudweb1.service;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb1.model.Student;

public interface StudentService {

    public abstract Iterable<Student> getAllStudents();
    public abstract Student saveStudent(Student student);
    public abstract Student getStudentById(Integer studentId);
    public abstract void deleteStudentById(Integer studentId);

}
