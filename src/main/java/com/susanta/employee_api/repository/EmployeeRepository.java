package com.susanta.employee_api.repository;

import com.susanta.employee_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Find by department
    List<Employee> findByDepartment(String department);

    //Find by email
    List<Employee> findByEmail(String email);

    //Custom JPQL = avg salary by department
    @Query("SELECT e.department, AVG(e.salary FROM Employee e GROUP BY e.department")
    List<Object[]> findAverageSalaryByDepartment();
}
