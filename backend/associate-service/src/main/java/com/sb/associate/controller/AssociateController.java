package com.sb.associate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.associate.entity.Associate;
import com.sb.associate.service.AssociateService;

@RestController
@RequestMapping("/api/v1.0/associates")
public class AssociateController {

	private AssociateService associateService;
	
	@Autowired
	public AssociateController(AssociateService associateService) {
		this.associateService = associateService;
	}
	
	@PostMapping("/")
	public Associate addAssociates(@RequestBody Associate associate) {
		return associateService.createAssociate(associate);
	}
	
	@PatchMapping("/{associateId}/make-inactive")
	public Associate markAssociateInactive(@PathVariable(name="associateId")Long id) {
		return associateService.markAssociateInactive(id);
	}
	
	@PutMapping("/")
	public Associate updateAssociate(@RequestBody Associate associate) {
		return associateService.updateAssociate(associate);
	}
	
	@GetMapping("/{associateId}")
	public Associate getAssociateById(@PathVariable(name="associateId")Long id) {
		return associateService.getAssociate(id);
	}
	
	@GetMapping("/all-active")
	public List<Associate> getAllActiveAssociates(){
		return associateService.getAllActiveAssociates();
	}
	
	@GetMapping("/all")
	public List<Associate> getAllAssociates(){
		return associateService.getAllAssociates();
	}
	
}
