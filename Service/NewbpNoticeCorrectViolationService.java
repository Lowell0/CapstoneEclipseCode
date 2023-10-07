package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.NewbpNoticeCorrectViolationEntity;
import com.bfpoms.bfpoms.Repository.NewbpNoticeCorrecViolationRepository;



@Service
public class NewbpNoticeCorrectViolationService {
	
	@Autowired
	NewbpNoticeCorrecViolationRepository newncvrepo;
	
	//read all records
	public List<NewbpNoticeCorrectViolationEntity> getAllNewbpNoticeCorrectViolation(){
		return newncvrepo.findAll();
	}
	
	//update records
	public NewbpNoticeCorrectViolationEntity putNewbpNoticeCorrectViolation(int newncv_id, NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolationDetails) throws Exception{
		
		NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolation = new NewbpNoticeCorrectViolationEntity();
		
		try {
			//search
			newNewbpNoticeCorrectViolation = newncvrepo.findById(newncv_id).get();
			
			//update
			newNewbpNoticeCorrectViolation.setStatus(newNewbpNoticeCorrectViolationDetails.getStatus());
			
			//save
			return newncvrepo.saveAndFlush(newNewbpNoticeCorrectViolation);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + newncv_id + "Doest not Exist!");
		}
		
	}

}
