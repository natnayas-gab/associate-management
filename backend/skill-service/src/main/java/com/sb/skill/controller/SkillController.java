package com.sb.skill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.skill.entity.Skill;
import com.sb.skill.service.SkillService;

@RestController()
@RequestMapping("/api/v1.0/skills")
public class SkillController {
	
	private SkillService skillService;
	
	@Autowired
	public SkillController(SkillService skillService) {
		// TODO Auto-generated constructor stub
		this.skillService = skillService;
	}
	
	@PostMapping("/")
	public Skill addSkill(@RequestBody Skill skill) {
		return skillService.addSkill(skill);
	}
	
	@GetMapping("/all")
	public List<Skill> getAllSkill(){
		return skillService.getAllSkills();
	}
	
	@PutMapping("/")
	public Skill updateSkill(@RequestBody Skill skill) {
		return skillService.updateSkill(skill);
		
	}
	
	@GetMapping("/{skillId}")
	public Skill getSkillById(@PathVariable(name="skillId") Long id ){
		return skillService.getSkillById(id);
	}

}
