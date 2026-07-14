package com.shrijal.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentServer {
//    1. store the student (POST)

        @PostMapping("/create")
        public String storeStudent(@RequestBody Student student){
            int id = student.getId();
            String name = student.getName();
            int age = student.getAge();
            String department = student.getDepartment();

            return "id: " + id + " " + "name: " + name + " " + "age: " + age + " " + "department: " + department;
        }

//    2.Read the Student with Id (GET)


//    3.Update the student information (PUT,PATCH)


//    4.Delete the student information (DELETE)
}
