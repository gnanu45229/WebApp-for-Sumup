package cys.gnanu.SumUp.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cys.gnanu.SumUp.TO.GroupForm;
import cys.gnanu.SumUp.data.FixedInvestGroups;
import cys.gnanu.SumUp.service.GroupService;

@Controller
public class GroupsController {
	Logger logs = org.slf4j.LoggerFactory.getLogger(GroupsController.class);
	
	@Autowired
	private GroupService groupService;
	
	
	/**
	 * Handles the creation of a new group.
	 * 
	 * @param form  The form containing group details.
	 * @param model The model to add attributes for the view.
	 * @return A string indicating the view name to be rendered.
	 */
	@PostMapping("/createGroups")
	public String createGroup(@ModelAttribute  GroupForm form,Model model) {
		
//		List<User> userName = service.findDuplicateAlias(group.getAlias());
//		List<FixedInvestGroups> duplicateGroups=groupService.findGroupByName(group.getGroupName());
		
		FixedInvestGroups groups = new FixedInvestGroups();
		groups.setAliasList(form.getAlias());
		groups.setGroupName(form.getGroupName());
		groups.setRoi(form.getRoi());
		groups.setStrtDate(form.getStartDate()); 
		groups.setEndDate(form.getEndDate());
		groups.setSumAmount(form.getSumAmount());
		
		//check members of the group
		
		
		groupService.createGroup(groups);
		
		  logs.info("Group created with name: {}", groups.getGroupName());
		return "land";
	}  

}
