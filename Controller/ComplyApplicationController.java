package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.ComplyApplicationEntity;
import com.bfpoms.bfpoms.Service.ComplyApplicationService;

@RestController
@CrossOrigin
@RequestMapping("/complyapp")
public class ComplyApplicationController {
	
	@Autowired
	ComplyApplicationService cserv;
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	@GetMapping("/getComplyApp")
	public List<ComplyApplicationEntity> getAllComplyApplication(){
		return cserv.getAllComplyApplication();
	}
	
	@PutMapping("/putComplyApp")
	public ComplyApplicationEntity putComplyApplication(int comply_id, ComplyApplicationEntity newComplyApplicationDetails) throws Exception{
		return cserv.putComplyApplication(comply_id, newComplyApplicationDetails);
	}

}
