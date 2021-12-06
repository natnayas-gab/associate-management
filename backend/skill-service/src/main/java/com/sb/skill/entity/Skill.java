package com.sb.skill.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Skill")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long skillId;
	private String skillName;
	
}
