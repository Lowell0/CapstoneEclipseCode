package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.CorrectViolationEntity;
import com.bfpoms.bfpoms.Service.CorrectViolationService;

@RestController
@CrossOrigin
@RequestMapping("/correctviolation")
public class CorrectViolationController {
	
	@Autowired
	CorrectViolationService cvserv;
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@GetMapping("/getAllCorrectViolation")
	public List<CorrectViolationEntity> getAllCorrectViolation(){
		return cvserv.getAllCorrectViolation();
	}
	
	@PutMapping("/putCorrectionViolation")
	public CorrectViolationEntity putCorrectViolation(@RequestParam int cv_id, CorrectViolationEntity newCorrectViolationDetails) throws Exception{
		return cvserv.putCorrectViolation(cv_id, newCorrectViolationDetails);
	}

}
