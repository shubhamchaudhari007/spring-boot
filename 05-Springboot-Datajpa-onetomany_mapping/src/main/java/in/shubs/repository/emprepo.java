package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.entity.Employee;

public interface emprepo extends JpaRepository<Employee, Integer>{

}
