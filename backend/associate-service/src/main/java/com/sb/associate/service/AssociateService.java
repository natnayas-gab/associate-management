package com.sb.associate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.associate.entity.Associate;

@Service
public interface AssociateService {

	
	Associate createAssociate(Associate associate);
	Associate markAssociateInactive(Long id);
	Associate updateAssociate(Associate associate);
	Associate getAssociate(Long id);
	List<Associate> getAllActiveAssociates();
	List<Associate> getAllAssociates();
}
