package com.greatlearning.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.greatlearning.EmployeeManagement.Entity.Employee;

import antlr.collections.List;

@Repository
public class EmployeeRepository extends JpaRepository<Employee, Integer> {

	

}
