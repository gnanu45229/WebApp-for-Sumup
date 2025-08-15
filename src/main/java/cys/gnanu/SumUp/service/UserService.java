package cys.gnanu.SumUp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cys.gnanu.SumUp.data.User;
import cys.gnanu.SumUp.repo.UserDAO;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	UserDAO dao;
	
//	@Autowired
//	GroupDAO groupDAO;
	
	@Transactional
	public User addUser(User user) {
		return dao.save(user);
		
	}
	@Transactional
	public List<User> findDuplicateAlias(String alias) {
		return dao.findDuplicateAlias(alias);
	}
	
	
	

}
