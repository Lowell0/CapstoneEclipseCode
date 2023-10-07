package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.AbatementOrderEntity;
import com.bfpoms.bfpoms.Service.AbatementOrdeService;

@RestController
@CrossOrigin
@RequestMapping("/abatementorder")
public class AbatementOrderController {
	
	@Autowired
	AbatementOrdeService aorserv;
	
	@GetMapping("/getAllAbatementOrder")
	public List<AbatementOrderEntity> getAllAbatementOrder(){
		return aorserv.getAllAbatementOrder();
	}
	
	@PutMapping("putAbatementOrder")
	public AbatementOrderEntity putAbatementOrder(int id, AbatementOrderEntity newAbatementOrderDetails) throws Exception{
		return aorserv.putAbatementOrder(id, newAbatementOrderDetails);
	}
	

}
