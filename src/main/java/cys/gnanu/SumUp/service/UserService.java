package cys.gnanu.SumUp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cys.gnanu.SumUp.data.FixedInvestGroups;
import cys.gnanu.SumUp.data.Members;
import cys.gnanu.SumUp.data.User;
import cys.gnanu.SumUp.repo.GroupDAO;
import cys.gnanu.SumUp.repo.UserDAO;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	UserDAO dao;
	
	@Autowired
	GroupDAO groupDAO;
	
	@Transactional
	public User addUser(User user) {
		return dao.save(user);
		
	}
	
	@Transactional
	public void createGroup(FixedInvestGroups groups) {
		for (Members m: groups.getMembers()) {
			m.setFixedInvestGroup(groups);
		}

		groupDAO.save(groups);
	}
	

}
