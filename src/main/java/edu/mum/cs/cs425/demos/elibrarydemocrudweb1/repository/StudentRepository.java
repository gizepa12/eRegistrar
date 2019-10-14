package edu.mum.cs.cs425.demos.elibrarydemocrudweb1.repository;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb1.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    // This interface definition relies on the public abstract methods
    // inherited from the super interface, CrudRepository<T, ID>
    // We may override any or add more methods here, if needed.
}
