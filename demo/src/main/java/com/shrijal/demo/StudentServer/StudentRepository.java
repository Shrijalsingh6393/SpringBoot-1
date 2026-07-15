package com.shrijal.demo.StudentServer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
//    public Student save(Student student){
//        System.out.println("Student Information saved");
//        return student;
//    }
}



// JpaRepository(interface) has methods