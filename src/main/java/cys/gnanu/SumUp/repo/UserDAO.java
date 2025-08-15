package cys.gnanu.SumUp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cys.gnanu.SumUp.data.User;

@EnableJpaRepositories
@Repository
public interface UserDAO extends JpaRepository<User, Integer>{
	
	public List<User> findAll();
	
	
	@Query("from  User u where u.alias= ?1")
	public List<User> findDuplicateAlias(@Param("alias") String alias);
	
	
}
