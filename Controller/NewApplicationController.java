package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.NewApplicationEntity;
import com.bfpoms.bfpoms.Service.NewApplicationService;

@RestController
@RequestMapping("/application")
@CrossOrigin
public class NewApplicationController {

	@Autowired
	NewApplicationService nserv;
	
	
	//print
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	//get all applications
	@GetMapping("/getAllNewApplication")
	public List<NewApplicationEntity> getAllNewApplication(){
		return nserv.getAllNewApplication();
	}

	@PutMapping("/putNewApplication/{id}")
	public NewApplicationEntity putNewApplication(@PathVariable int new_id, @RequestBody NewApplicationEntity newNewApplicationDetails) throws Exception{
		return nserv.putNewApplication(new_id, newNewApplicationDetails);
	}
	
}

