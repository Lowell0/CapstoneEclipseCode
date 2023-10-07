package com.bfpoms.bfpoms.Service;

import java.util.List;

import org.aspectj.bridge.AbortException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.NewbpNoticeComplyEntity;
import com.bfpoms.bfpoms.Repository.NewbpNoticeComplyRepository;

@Service
public class NewbpNoticeComplyService {
	
	@Autowired
	NewbpNoticeComplyRepository newncrepo;
	
	//read all records
	public List<NewbpNoticeComplyEntity> getAllNewbpNoticeComply(){
		return newncrepo.findAll();
	}
	
	//update records
	public NewbpNoticeComplyEntity putNewbpNoticeComply(int newnoticecomply_id, NewbpNoticeComplyEntity newNewbpNoticeComplyDetails) throws Exception {
		
		NewbpNoticeComplyEntity newNewbpNoticeComply = new NewbpNoticeComplyEntity();
		
		try {
			//search
			newNewbpNoticeComply = newncrepo.findById(newnoticecomply_id).get();
			
			//update
			newNewbpNoticeComply.setStatus(newNewbpNoticeComplyDetails.getStatus());
			
			//save
			return newncrepo.save(newNewbpNoticeComply);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +newnoticecomply_id+ "Does not Exist!");
		}
	}
	
	

}
