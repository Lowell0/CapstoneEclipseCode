package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.BpApplicationsEntity;
import com.bfpoms.bfpoms.Service.BpApplicationsService;

@RestController
@CrossOrigin
@RequestMapping("/bpapplications")
public class BpApplicationsConroller {

	@Autowired
	BpApplicationsService bpaserv;
	
	@GetMapping("/getAllBPApplications")
	public List<BpApplicationsEntity> getAllBpApplications(){
		return bpaserv.getAllBpApplications();
	}
	
	@PutMapping("/putBPApplications")
	public BpApplicationsEntity putBpApplications(int bpa_id, BpApplicationsEntity newBpApplicationsDetails) throws Exception {
		return bpaserv.putBpApplications(bpa_id, newBpApplicationsDetails);
	}
	
}
