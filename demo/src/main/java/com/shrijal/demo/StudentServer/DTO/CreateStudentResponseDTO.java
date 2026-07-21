package com.shrijal.demo.StudentServer.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateStudentResponseDTO {
    private int id;
    private String name;
    private int age;
    private String department;
    @Email(message = "Invalid Email")
    @NotBlank(message = "Email is required")
    private String email;
}