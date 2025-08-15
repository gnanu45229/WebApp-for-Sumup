package cys.gnanu.SumUp.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import cys.gnanu.SumUp.data.FixedInvestGroups;

public interface FixedInvestGroupsRepository extends JpaRepository<FixedInvestGroups, Long> {
	
//	@Query("from  FixedInvestGroups g where g.groupNmae= ?1")
//	public List<FixedInvestGroups> findDuplicateAlias(@Param("groupNmae") String gName);
//	
	
	
}
