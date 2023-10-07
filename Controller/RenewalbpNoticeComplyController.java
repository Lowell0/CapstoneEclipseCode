package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.RenewalbpNoticeComplyEntity;
import com.bfpoms.bfpoms.Service.RenewalbpNoticeComplyService;

@RestController
@RequestMapping("/renewalbpnoticetocomply")
@CrossOrigin
public class RenewalbpNoticeComplyController {

	@Autowired
	RenewalbpNoticeComplyService renewncserv;
	
	//read all records
	@GetMapping("/getAllRenewalbpNoticeToComply")
	public List<RenewalbpNoticeComplyEntity> getAllRenewalbpNoticeComply(){
		return renewncserv.getAllRenewalbpNoticeComply();
	}
	
	public RenewalbpNoticeComplyEntity putRenewalbpNoticeComply(int renewnc_id, RenewalbpNoticeComplyEntity newRenewalbpNoticeComplyDetails) throws Exception{
		return renewncserv.putRenewalbpNoticeComply(renewnc_id, newRenewalbpNoticeComplyDetails);
	}
}
