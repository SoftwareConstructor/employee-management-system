package net.guides.springboot2.springboot2jpacrudemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudemployee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}