package com.sb.project.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.project.entity.Project;
import com.sb.project.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{

	private ProjectRepository projectRepository;
	
	@Autowired
	public ProjectServiceImpl(ProjectRepository projectRepository) {
		// TODO Auto-generated constructor stub
		this.projectRepository = projectRepository;
	}
	@Override
	public Project createProject(Project project) {
		// TODO Auto-generated method stub
		return this.projectRepository.save(project);
	}

	@Override
	public Project updateProject(Project project) {
		// TODO Auto-generated method stub
		return this.projectRepository.save(project);
	}

	@Override
	public List<Project> getAllActiveProject(String status) {
		// TODO Auto-generated method stub
		return this.projectRepository.findAll().stream().filter(p->p.getStatus().equalsIgnoreCase(status) && p.isActive()).collect(Collectors.toList());
	}

	@Override
	public List<Project> getAllProject(String status) {
		// TODO Auto-generated method stub
		return this.projectRepository.findAll().stream().filter(p->p.getStatus().equalsIgnoreCase(status)).collect(Collectors.toList());
	}

	@Override
	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return this.projectRepository.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public Project getProjectById(Long id) {
		// TODO Auto-generated method stub
		Optional<Project> optionalProject = this.projectRepository.findById(id);
		if(optionalProject.isPresent())
			return optionalProject.get();
		else 
			return null;
	}
	
	@Override
	public Project makeProjectInactive(Long id) {
		// TODO Auto-generated method stub
		Optional<Project> optionalProject = this.projectRepository.findById(id);
		if(optionalProject.isPresent()) {
			Project project = optionalProject.get();
			project.setActive(false);
			return this.projectRepository.save(project);
		}else {
			return null;
		}
		
	}
	
	@Override
	public Project changeProjectStatus(Long id,String status) {
		// TODO Auto-generated method stub
		Optional<Project> optionalProject = this.projectRepository.findById(id);
		if(optionalProject.isPresent()) {
			Project project = optionalProject.get();
			project.setStatus(status);
			return this.projectRepository.save(project);
		}else {
			return null;
		}
		
	}

}
