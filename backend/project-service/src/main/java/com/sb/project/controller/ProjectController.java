package com.sb.project.controller;

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

import com.sb.project.entity.Project;
import com.sb.project.service.ProjectService;

@RestController
@RequestMapping("/api/v1.0/projects")
public class ProjectController {

	private ProjectService projectService;
	@Autowired
	public ProjectController(ProjectService projectService) {
		// TODO Auto-generated constructor stub
		this.projectService = projectService;
	}
	
	
	@PostMapping("/")
	public Project createProject(@RequestBody Project project) {
		return this.projectService.createProject(project);
	}
	
	
	@PutMapping("/")
	public Project updateProject(@RequestBody Project project) {
		return this.projectService.updateProject(project);
	}
	
	@PatchMapping("/{projectId}/make-project-inactive")
	public Project updateProject(@PathVariable(name="projectId")Long id) {
		return this.projectService.makeProjectInactive(id);
	}
	
	@PatchMapping("/{projectId}/change-project-status/{status}")
	public Project updateProject(@PathVariable(name="projectId")Long id,@PathVariable(name="status")String status) {
		return this.projectService.changeProjectStatus(id, status);
	}
	
	@GetMapping("/all-acitve/{status}")
	public List<Project> getAllActiveProjectsByStatus(@PathVariable(name="status")String status) {
		return this.projectService.getAllActiveProject(status);
	}
	
	@GetMapping("/all/{status}")
	public List<Project> getAllProjectsByStatus(@PathVariable(name="status")String status) {
		return this.projectService.getAllProject(status);
	}
	
	@GetMapping("/{projectId}")
	public Project getProject(@PathVariable(name="projectId")Long id) {
		return this.projectService.getProjectById(id);
	}
	
	
}

