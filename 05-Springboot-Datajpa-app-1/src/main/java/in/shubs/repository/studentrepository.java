package in.shubs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.shubs.entity.student;

public interface studentrepository extends CrudRepository<student, Integer> {
	
//	public List<student> findByAgeLessThanEqual(Integer age);
//	
//	public List<student> findByGrades(Character grades);
//	
//	public List<student> findByGradesAndAgeLessThan(Character grades,Integer age);
	
	
	@Query(value = "select * from student" , nativeQuery = true)
	public List<student> getallstudents();
	
	@Query(value = "from student")
	public List<student> getstudent();

}
