/*package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.BusinessEstablishmentEntity;
import com.bfpoms.bfpoms.Service.BusinessEstablishmentService;

@RestController
@CrossOrigin
@RequestMapping("/businessestablishment")
public class BusinessEstablishmentController {
	
	BusinessEstablishmentService beserv;
	
	@PostMapping("/insertBusiness")
	public BusinessEstablishmentEntity insertBusiness(@RequestBody BusinessEstablishmentEntity business) {
		return beserv.insertBusiness(business);
		
	}
	
	@GetMapping("/getBusiness")
	public List<BusinessEstablishmentEntity> getAllBusinessEstablsihment(){
		return beserv.getAllBusinessEstablsihment();
	}
	
	@PutMapping("/putBusiness")
	public BusinessEstablishmentEntity putBusinessEstablishment(@PathVariable int id, @RequestBody BusinessEstablishmentEntity newBusinessEstablishmentDetails) throws Exception{
		return beserv.putBusinessEstablishment(id, newBusinessEstablishmentDetails);
	}
	

}
*/