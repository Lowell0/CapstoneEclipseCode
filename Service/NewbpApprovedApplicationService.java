package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.NewbpApprovedApplicationEntity;
import com.bfpoms.bfpoms.Repository.NewbpApprovedApplicationRepository;

@Service
public class NewbpApprovedApplicationService {

	@Autowired
	NewbpApprovedApplicationRepository newbprepo;
	
	//Read all records
	public List<NewbpApprovedApplicationEntity> getAllNewbpApprovedApplication(){
		return newbprepo.findAll();
		
	}
	
	//update records
	public NewbpApprovedApplicationEntity putNewbpApprovedApplication(int newbp_id, NewbpApprovedApplicationEntity newNewbpApprovedApplicationDetails) throws Exception{
		
		NewbpApprovedApplicationEntity newNewbpApprovedApplication = new NewbpApprovedApplicationEntity();
		
		try {
			//search
			newNewbpApprovedApplication = newbprepo.findById(newbp_id).get();
			
			//update
			newNewbpApprovedApplication.setRemarks(newNewbpApprovedApplicationDetails.getRemarks());
			
			//save
			return newbprepo.save(newNewbpApprovedApplication);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + newbp_id + "Does not Exist!");
		}
	}
	
	
}
