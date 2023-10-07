package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.RenewalbpNoticeCorrectViolationEntity;
import com.bfpoms.bfpoms.Service.RenewalbpNoticeCorrectViolationService;

@RestController
@RequestMapping("/renewalbpnoticetocorrectviolation")
@CrossOrigin
public class RenewalbpNoticeCorrectViolationController {
	
	@Autowired
	RenewalbpNoticeCorrectViolationService renewcvserv;

	
	//read all records
	@GetMapping("/getAllRenewalbpNoticeToCorrectViolation")
	public List<RenewalbpNoticeCorrectViolationEntity> getAllRenewalbpNoticeCorrectViolation(){
		return renewcvserv.getAllRenewalbpNoticeCorrectViolation();
	}
	
	public RenewalbpNoticeCorrectViolationEntity putRenewalbpNoticeCorrectViolation(int renewao_id, RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolationDetials) throws Exception{
		return renewcvserv.putRenewalbpNoticeCorrectViolation(renewao_id, newRenewalbpNoticeCorrectViolationDetials);
	}
}
