package com.susanta.employee_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @NotBlank(message = "Department is required")
    private String Department;


    @Positive(message = "Salary must be positive")
    @NotBlank(message = "Salary is required")
    @Column(nullable = false)
    private Double salary;

    @Email(message = "Invalid email format")
    @NotBlank(message =  "Email is required")
    @Column(nullable = false, unique = true)
    private String email;
}
