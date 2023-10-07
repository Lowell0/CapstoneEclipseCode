package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.NewbpNoticeComplyEntity;
import com.bfpoms.bfpoms.Service.NewbpNoticeComplyService;

@RestController
@RequestMapping("/newbpnoticetocomply")
@CrossOrigin
public class NewbpNoticeComplyController {
	
	@Autowired
	NewbpNoticeComplyService newncserv;
	
	//get all records
	@GetMapping("/getAllNewbpNoticetoComply")
	public List<NewbpNoticeComplyEntity> getAllNewbpNoticeComply(){
		return newncserv.getAllNewbpNoticeComply();
		
	}
	
	//update records
	@PutMapping("/putNewbpNotucetoComply")
	public NewbpNoticeComplyEntity putNewbpNoticeComply(int newnoticecomply_id, NewbpNoticeComplyEntity newNewbpNoticeComplyDetails) throws Exception {
		return newncserv.putNewbpNoticeComply(newnoticecomply_id, newNewbpNoticeComplyDetails);
	}
		
	
	

}
