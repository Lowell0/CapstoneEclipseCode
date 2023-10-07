package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.RenewalbpNoticeComplyEntity;
import com.bfpoms.bfpoms.Repository.RenewalbpNoticeComplyRepository;

@Service
public class RenewalbpNoticeComplyService {

	@Autowired
	RenewalbpNoticeComplyRepository renewncrepo;
	
	//read all records
	public List<RenewalbpNoticeComplyEntity> getAllRenewalbpNoticeComply(){
		return renewncrepo.findAll();
	}
	
	//update records
	public RenewalbpNoticeComplyEntity putRenewalbpNoticeComply(int renewnc_id, RenewalbpNoticeComplyEntity newRenewalbpNoticeComplyDetails) throws Exception{
		
		RenewalbpNoticeComplyEntity newRenewalbpNoticeComply = new RenewalbpNoticeComplyEntity();
		
		try {
			//search
			newRenewalbpNoticeComply = renewncrepo.findById(renewnc_id).get();
			
			//update
			newRenewalbpNoticeComply.setStatus(newRenewalbpNoticeComplyDetails.getStatus());
			
			//save
			return renewncrepo.save(newRenewalbpNoticeComply);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +renewnc_id+ "Does not Exist!");
		}
	}
}
