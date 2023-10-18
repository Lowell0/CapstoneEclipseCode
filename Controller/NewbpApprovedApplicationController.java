package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.NewbpApprovedApplicationEntity;
import com.bfpoms.bfpoms.Service.NewbpApprovedApplicationService;

@RestController
@RequestMapping("/newbpapprovedapplication")
@CrossOrigin
public class NewbpApprovedApplicationController {
	
	@Autowired
	NewbpApprovedApplicationService newbpserv;
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	//get All Applications
	@GetMapping("/getAllNewbpApprovedApplication")
	public List<NewbpApprovedApplicationEntity> getAllNewbpApprovedApplication(){
		return newbpserv.getAllNewbpApprovedApplication();
	}
	
	//update records
	@PutMapping("/putNewbpApprovedApplication")
	public NewbpApprovedApplicationEntity putNewbpApprovedApplication(@RequestParam int newbp_id, @RequestBody NewbpApprovedApplicationEntity newNewbpApprovedApplicationDetails) throws Exception{
		return newbpserv.putNewbpApprovedApplication(newbp_id, newNewbpApprovedApplicationDetails);
	}
	
	

}
