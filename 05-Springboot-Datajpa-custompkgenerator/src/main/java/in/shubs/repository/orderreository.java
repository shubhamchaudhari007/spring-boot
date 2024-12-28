package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.entity.orderdetails;

public interface orderreository extends JpaRepository<orderdetails, String> {

}
