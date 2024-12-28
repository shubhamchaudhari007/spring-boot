package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.entity.product;

public interface productrepository extends JpaRepository<product, Integer> {

}
