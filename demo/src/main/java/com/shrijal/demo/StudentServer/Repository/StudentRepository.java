package com.shrijal.demo.StudentServer.Repository;
import com.shrijal.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
//    public Student save(Student student){
//        System.out.println("Student Information saved");
//        return student;
//    }
}



// JpaRepository(interface) has methods