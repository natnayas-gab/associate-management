package com.sb.skill.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.skill.entity.Skill;

@Service
public interface SkillService {

	Skill addSkill(Skill skill);
	
	Skill updateSkill(Skill skill);
	List<Skill> getAllSkills();
	Skill getSkillById(Long id);
}
