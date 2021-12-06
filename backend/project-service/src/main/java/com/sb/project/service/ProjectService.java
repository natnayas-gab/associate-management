package com.sb.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.project.entity.Project;
@Service
public interface ProjectService {
	
	Project createProject(Project project);
	Project updateProject(Project project);
	List<Project> getAllActiveProject(String status);
	List<Project> getAllProject(String status);
	List<Project> getAllProject();
	Project getProjectById(Long id);
	Project makeProjectInactive(Long projectId);
	Project changeProjectStatus(Long id, String status);
	

}
