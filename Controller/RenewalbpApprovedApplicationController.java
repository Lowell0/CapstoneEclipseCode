package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.RenewalbpApprovedApplicationEntity;
import com.bfpoms.bfpoms.Service.RenewalbpApprovedApplicationService;

@RestController
@RequestMapping("/renewalbpapprovedapplication")
@CrossOrigin
public class RenewalbpApprovedApplicationController {

	@Autowired
	RenewalbpApprovedApplicationService renewapserv;
	
	//read all records
	@GetMapping("/getAllRenewalbpApprovedApplication")
	public List<RenewalbpApprovedApplicationEntity> getAllRenewabpApprovedApplication(){
		return renewapserv.getAllRenewabpApprovedApplication();
	}
	public RenewalbpApprovedApplicationEntity putAllRenewalbpApprovedApplication(int renewbp_id, RenewalbpApprovedApplicationEntity newRenewalbpApprovedApplicationDetails) throws Exception{
		return renewapserv.putAllRenewalbpApprovedApplication(renewbp_id, newRenewalbpApprovedApplicationDetails);
	}
	
	
}
