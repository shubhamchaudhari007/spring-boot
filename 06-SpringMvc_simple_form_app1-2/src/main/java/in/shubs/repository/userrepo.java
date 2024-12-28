package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.binding.User;
import in.shubs.entity.user;

public interface userrepo extends JpaRepository<user, Integer> {

}
