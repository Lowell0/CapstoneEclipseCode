package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.NewbpAbatementOrderEntity;
import com.bfpoms.bfpoms.Service.NewbpAbatementOrderService;

@RestController
@RequestMapping("/newbpabatementorder")
@CrossOrigin
public class NewbpAbatementOrderController {
	
	@Autowired
	NewbpAbatementOrderService newaoserv;
	
	@GetMapping("/getAllNewbpAbatementOrder")
	public List<NewbpAbatementOrderEntity> getAllNewbpAbatementOrder(){
		return newaoserv.getAllNewbpAbatementOrder();
	}
	
	@PutMapping("/putNewbpAbatementOrder")
	public NewbpAbatementOrderEntity putNewbpAbatementOrder(int newao_id, NewbpAbatementOrderEntity newNewbpAbatementOrderDetails) throws Exception {
		return newaoserv.putNewbpAbatementOrder(newao_id, newNewbpAbatementOrderDetails);
}
}
