package com.sb.associate.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.associate.entity.Associate;
import com.sb.associate.repository.AssociateRepository;

@Service
public class AssociateServiceImpl implements AssociateService{

	private AssociateRepository associateRepository;
	
	@Autowired
	public AssociateServiceImpl(AssociateRepository associateRepository) {
		// TODO Auto-generated constructor stub
		this.associateRepository = associateRepository;
	}
	
	
	@Override
	public Associate createAssociate(Associate associate) {
		// TODO Auto-generated method stub
		return this.associateRepository.save(associate);
	}

	@Override
	public Associate markAssociateInactive(Long id) {
		// TODO Auto-generated method stub
		Associate associate = this.associateRepository.getById(id);
		associate.setActive(false);
		return this.associateRepository.save(associate);
	}

	@Override
	public Associate updateAssociate(Associate associate) {
		// TODO Auto-generated method stub
		return this.associateRepository.save(associate);
	}

	@Override
	public Associate getAssociate(Long id) {
		// TODO Auto-generated method stub
		Optional<Associate> optionalAssociate = this.associateRepository.findById(id);
		if(optionalAssociate.isPresent())
			return optionalAssociate.get();
		else
			return null;
	}

	@Override
	public List<Associate> getAllActiveAssociates() {
		// TODO Auto-generated method stub
		return this.associateRepository.findAll().stream().filter(a->a.isActive()).collect(Collectors.toList());
	}

	@Override
	public List<Associate> getAllAssociates() {
		// TODO Auto-generated method stub
		return this.associateRepository.findAll();
	}

}
