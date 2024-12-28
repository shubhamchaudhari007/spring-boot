package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.entity.Address;

public interface addressrepo extends JpaRepository<Address, Integer> {

}
