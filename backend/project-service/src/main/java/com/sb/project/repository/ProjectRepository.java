package com.sb.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.project.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
