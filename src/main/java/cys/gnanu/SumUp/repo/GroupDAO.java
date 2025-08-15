package cys.gnanu.SumUp.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cys.gnanu.SumUp.data.FixedInvestGroups;

@Repository
public interface GroupDAO extends JpaRepository<FixedInvestGroups, Integer>{

}