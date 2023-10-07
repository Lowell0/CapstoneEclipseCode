package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.NewbpNoticeCorrectViolationEntity;
import com.bfpoms.bfpoms.Service.NewbpNoticeCorrectViolationService;

@RestController
@CrossOrigin
@RequestMapping("/newbpnoticecorrectviolation")
public class NewbpNoticeCorrectviolationController {
	
	@Autowired
	NewbpNoticeCorrectViolationService newncvserv;

	//read all records
	@GetMapping("/getAllNewbpCorrectViolation")
	public List<NewbpNoticeCorrectViolationEntity> getAllNewbpNoticeCorrectViolation(){
		return newncvserv.getAllNewbpNoticeCorrectViolation();
	}
	
	//update records
	@PutMapping("/putNewbpCorrectViolation")
	public NewbpNoticeCorrectViolationEntity putNewbpNoticeCorrectViolation(int newncv_id, NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolationDetails) throws Exception{
		return newncvserv.putNewbpNoticeCorrectViolation(newncv_id, newNewbpNoticeCorrectViolationDetails);
	}
}
