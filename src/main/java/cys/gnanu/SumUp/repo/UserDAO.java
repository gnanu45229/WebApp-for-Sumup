package cys.gnanu.SumUp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cys.gnanu.SumUp.data.User;


@Repository
public interface UserDAO extends JpaRepository<User, Integer>{
	
	

}
