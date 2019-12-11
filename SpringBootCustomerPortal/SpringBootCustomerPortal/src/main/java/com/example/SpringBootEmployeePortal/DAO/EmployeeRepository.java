package com.example.SpringBootEmployeePortal.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootEmployeePortal.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public List<Employee> findAllByOrderByLastNameAsc();
}
