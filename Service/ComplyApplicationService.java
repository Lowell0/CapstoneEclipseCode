package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.ComplyApplicationEntity;
import com.bfpoms.bfpoms.Repository.ComplyApplicationRepository;

@Service
public class ComplyApplicationService {
	
	@Autowired
	ComplyApplicationRepository crepo;
	
	//read all records
	public List<ComplyApplicationEntity> getAllComplyApplication(){
		return crepo.findAll();
	}
	
	//update records
	public ComplyApplicationEntity putComplyApplication(int comply_id, ComplyApplicationEntity newComplyApplicationDetails) throws Exception{
		
		ComplyApplicationEntity newComplyApplication = new ComplyApplicationEntity();
		
		try {
			//search
			newComplyApplication = crepo.findById(comply_id).get();
			
			//update
			newComplyApplication.setStatus(newComplyApplicationDetails.getStatus());
			
			//save
			return crepo.save(newComplyApplication);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number " + comply_id + "Does not Exist");
		}
	}
}
