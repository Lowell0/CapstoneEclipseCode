package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.RenewalbpAbatementOrderEntity;
import com.bfpoms.bfpoms.Service.RenewalbpAbatementOrderService;

@RestController
@RequestMapping("/renewalbpabatementorder")
@CrossOrigin
public class RenewalbpAbatementOrderController {

	@Autowired
	RenewalbpAbatementOrderService renewaoserv;
	//read all records
	@GetMapping("/getAllRenewalbpAbatementOrder")
	public List<RenewalbpAbatementOrderEntity> getAllRenewalbpAbatementOrder(){
		return renewaoserv.getAllRenewalbpAbatementOrder();
	}
	
	public RenewalbpAbatementOrderEntity putRenewalbpAbatementOrder(int renewao_id, RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		return renewaoserv.putRenewalbpAbatementOrder(renewao_id, newRenewalbpAbatementOrderDetails);
	}
		
	
	
}
