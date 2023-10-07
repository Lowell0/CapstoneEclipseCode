/*package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.BusinessEstablishmentEntity;
import com.bfpoms.bfpoms.Repository.BusinessEstablishmentRepository;

@Service
public class BusinessEstablishmentService {
	
	@Autowired
	BusinessEstablishmentRepository berepo;
	
	//create
	public BusinessEstablishmentEntity insertBusiness(BusinessEstablishmentEntity business) {
		return berepo.save(business);
	}
	
	//read
	public List<BusinessEstablishmentEntity> getAllBusinessEstablsihment(){
		return berepo.findAll();
	}
	
	//update
	public BusinessEstablishmentEntity putBusinessEstablishment(int id, BusinessEstablishmentEntity newBusinessEstablishmentDetails) throws Exception{
		
		BusinessEstablishmentEntity business = new BusinessEstablishmentEntity();
		
		try {
			//search
			business = berepo.findById(id).get();
			
			//update
			business.setPermit_no(newBusinessEstablishmentDetails.getPermit_no());
			business.setPermitee(newBusinessEstablishmentDetails.getPermitee());
			business.setBusiness_no(newBusinessEstablishmentDetails.getBusiness_no());
			business.setBusiness_address(newBusinessEstablishmentDetails.getBusiness_address());
			business.setAutorized_rep(newBusinessEstablishmentDetails.getAutorized_rep());
			
			//save
			return berepo.save(business);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + "Does not Esxist!");
		}
		
	}

}
*/