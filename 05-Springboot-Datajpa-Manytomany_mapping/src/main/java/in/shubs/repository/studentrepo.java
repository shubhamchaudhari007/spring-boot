package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.entity.Students;

public interface studentrepo extends JpaRepository<Students, Integer>{

}
