package com.sb.skill.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.skill.entity.Skill;
import com.sb.skill.repository.SkillRepository;
@Service
public class SkillServiceImpl implements SkillService{

	private SkillRepository skillRepository;
	
	@Autowired
	public SkillServiceImpl(SkillRepository skillRepository) {
		// TODO Auto-generated constructor stub
		this.skillRepository = skillRepository;
	}
	
	@Override
	public Skill addSkill(Skill skill) {
		// TODO Auto-generated method stub
		return this.skillRepository.save(skill);
	}

	@Override
	public Skill updateSkill(Skill skill) {
		// TODO Auto-generated method stub
		return this.skillRepository.save(skill);
	}

	@Override
	public List<Skill> getAllSkills() {
		// TODO Auto-generated method stub
		return this.skillRepository.findAll();
	}

	@Override
	public Skill getSkillById(Long id) {
		// TODO Auto-generated method stub
		Optional<Skill> optionalSkill = this.skillRepository.findById(id);
		if(optionalSkill.isPresent()) 
			return optionalSkill.get();
		else 
			return null;
	}

}
