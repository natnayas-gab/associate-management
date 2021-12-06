package com.sb.project.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projectId;
	private String projectName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date projectDevStartDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date projectDevEndDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date projectStartDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date projectEndDate;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdDate;
	private boolean active;
	private String status;
	@Temporal(TemporalType.TIMESTAMP)
	private Date completionDate;
	
	
	
}
