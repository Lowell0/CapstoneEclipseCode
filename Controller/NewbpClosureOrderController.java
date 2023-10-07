package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.NewbpClosureOrderEntity;
import com.bfpoms.bfpoms.Service.NewbpClosureOrderService;

@RestController
@RequestMapping("/newbpclosureorder")
@CrossOrigin
public class NewbpClosureOrderController {

	@Autowired
	NewbpClosureOrderService newcoserv;
	
	
	//read all records
	public List<NewbpClosureOrderEntity> getAllNewbpClosureOrder(){
		return newcoserv.getAllNewbpClosureOrder();
	}
	public NewbpClosureOrderEntity putNewbpClosureOrder(int newco_id, NewbpClosureOrderEntity newNewbpClosureOrderDetails) throws Exception{
		return newcoserv.putNewbpClosureOrder(newco_id, newNewbpClosureOrderDetails);
	}
}
