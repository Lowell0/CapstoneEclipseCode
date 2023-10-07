package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.RenewalbpClosureOrderEntity;
import com.bfpoms.bfpoms.Service.RenewalbpClosureOrderService;

@RestController
@RequestMapping("/renewalbpclosureorder")
@CrossOrigin
public class RenewalbpClosureOrder {

	@Autowired
	RenewalbpClosureOrderService renewcoserv;
	
	//read all records
	@GetMapping("/getAllRenewalbpClosureOrder")
	public List<RenewalbpClosureOrderEntity> getAllRenewalbpClosureOrder(){
		return renewcoserv.getAllRenewalbpClosureOrder();
	}
	
	public RenewalbpClosureOrderEntity putRenewalbpClosureOrder(int renewco_id, RenewalbpClosureOrderEntity newRenewalbpClosureOrderDetails) throws Exception{
		return renewcoserv.putRenewalbpClosureOrder(renewco_id, newRenewalbpClosureOrderDetails);
	}
	
	
}
