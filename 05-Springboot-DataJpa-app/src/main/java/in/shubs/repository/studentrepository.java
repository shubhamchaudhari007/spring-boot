package in.shubs.repository;

import org.springframework.data.repository.CrudRepository;

import in.shubs.entity.student;

public interface studentrepository extends CrudRepository<student, Integer> {

}
