package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.RenewalbpApprovedApplicationEntity;
import com.bfpoms.bfpoms.Repository.RenewalbpApprovedApplicationRepository;

@Service
public class RenewalbpApprovedApplicationService {

	@Autowired
	RenewalbpApprovedApplicationRepository renewaprepo;
	
	//read all records
	public List<RenewalbpApprovedApplicationEntity> getAllRenewabpApprovedApplication(){
		return renewaprepo.findAll();
	}
	
	//update
	public RenewalbpApprovedApplicationEntity putAllRenewalbpApprovedApplication(int renewbp_id, RenewalbpApprovedApplicationEntity newRenewalbpApprovedApplicationDetails) throws Exception{
		
		RenewalbpApprovedApplicationEntity newRenewalbpApprovedApplication = new RenewalbpApprovedApplicationEntity();
		
		try {
			//search
			newRenewalbpApprovedApplication = renewaprepo.findById(renewbp_id).get();
			
			//update
			newRenewalbpApprovedApplication.setRemarks(newRenewalbpApprovedApplicationDetails.getRemarks());
			
			//save
			return renewaprepo.save(newRenewalbpApprovedApplication);
		}catch(NoResultException nex) {
			throw new Exception("Id Number" + renewbp_id + "Does not Exist!");
		}
	}
}
