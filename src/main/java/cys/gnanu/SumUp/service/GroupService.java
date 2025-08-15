package cys.gnanu.SumUp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cys.gnanu.SumUp.data.FixedInvestGroups;
import cys.gnanu.SumUp.repo.FixedInvestGroupsRepository;
import jakarta.transaction.Transactional;

@Service
public class GroupService {

	@Autowired
	FixedInvestGroupsRepository fixedInvestGroupsRepository;
	
	
	@Transactional
	public FixedInvestGroups createGroup(FixedInvestGroups groups) {
		return fixedInvestGroupsRepository.save(groups);
	}
	
//	@Transactional
//	public List<FixedInvestGroups> findGroupByName(String groupName) {
//		return fixedInvestGroupsRepository.findDuplicateAlias(groupName);
//	}

}
