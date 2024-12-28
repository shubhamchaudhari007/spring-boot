
package in.shubs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.shubs.entity.student;
import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;

public interface studentrepository extends JpaRepository<student, Integer> {
	
	//sql query
	@Query(value = "select * from student_dtl where stud_gender='male'" , nativeQuery = true)
	public List<student> getallstudents();
	
	//hql query
	@Query(value = "from student where gender='male'")
	List<student> getbyhql();
	
	//sql query
		@Query(value = "select * from student_dtl where stud_gender is null" , nativeQuery = true)
		public List<student> getbysql1();
		
		//hql query
		@Query(value = "from student where gender is null")
		List<student> getbyhql1();
		
		//sql
		@Query(value = "select * from student_dtl where stud_rank >= 100" , nativeQuery = true)
		public List<student> getbysql2();
		
		//hql query
		@Query(value = "from student where rank>=100")
		List<student> getbyhql2();	
		
		//sql
		@Query(value = "select * from student_dtl where stud_gender = 'male' and stud_rank <= 100" , nativeQuery = true)
		public List<student> getbysql3();
		
		@Query("delete from student where id = :sid")
		@Modifying
		@Transactional
		public void deletestudent(Integer sid);
		
		@Query("update student set gender = :sgender where id = :sid")
		@Modifying
		@Transactional
		public void updatestudent(Integer sid,String sgender);
		
		@Query(value ="insert into student_dtl (stud_id,stud_name,stud_gender) values (:id, :name, :gender)" ,nativeQuery = true)
		@Modifying
		@Transactional
		public void insertstud(Integer id,String name,String gender);
}
