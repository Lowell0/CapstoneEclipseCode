package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.RenewalbpNoticeCorrectViolationEntity;
import com.bfpoms.bfpoms.Repository.RenewalbpNoticeCorrectViolationRepository;

@Service
public class RenewalbpNoticeCorrectViolationService {

	@Autowired
	RenewalbpNoticeCorrectViolationRepository renewcvrepo;
	
	
	//read all records
	public List<RenewalbpNoticeCorrectViolationEntity> getAllRenewalbpNoticeCorrectViolation(){
		return renewcvrepo.findAll();
	}
	
	public RenewalbpNoticeCorrectViolationEntity putRenewalbpNoticeCorrectViolation(int renewao_id, RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolationDetials) throws Exception{
		
		RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolation = new RenewalbpNoticeCorrectViolationEntity();
		
		try {
			//search
			newRenewalbpNoticeCorrectViolation = renewcvrepo.findById(renewao_id).get();
			
			//update
			newRenewalbpNoticeCorrectViolation.setStatus(newRenewalbpNoticeCorrectViolation.getStatus());
			
			//save
			return renewcvrepo.save(newRenewalbpNoticeCorrectViolation);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +renewao_id+ "Does not Exsit!");
		}
	}
	
	
}
