package com.sb.associate.entity;

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
@Table(name="Associate")
public class Associate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long associateId;
	private String name;
	private String email;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String profilePicURI;
	private String cvURI;
	private Float yearsOfExperience;
	private boolean active;
	private String resourceType;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date resourceOnboaringDate;

}
