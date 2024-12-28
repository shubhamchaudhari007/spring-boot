package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.entity.Account;
import in.shubs.entity.Accountpk;

public interface Accountrepository extends JpaRepository<Account, Accountpk> {

}
