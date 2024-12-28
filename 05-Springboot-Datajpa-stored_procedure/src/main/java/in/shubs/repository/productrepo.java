package in.shubs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.shubs.entity.product;

public interface productrepo extends JpaRepository<product, Integer> {
	
	boolean True = false;

	@Query(value ="call getproduct()", nativeQuery = true)
	public List<product> getproducts();

}
