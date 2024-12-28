package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.entity.person;

public interface personrepo extends JpaRepository<person, Integer> {

}
