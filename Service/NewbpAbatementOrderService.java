package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.NewbpAbatementOrderEntity;
import com.bfpoms.bfpoms.Repository.NewbpAbatementOrderRepository;

@Service
public class NewbpAbatementOrderService {

	@Autowired
	NewbpAbatementOrderRepository newaorepo;
	
	//read all records
	public List<NewbpAbatementOrderEntity> getAllNewbpAbatementOrder(){
		return newaorepo.findAll();
	}
	
	//update records
	public NewbpAbatementOrderEntity putNewbpAbatementOrder(int newao_id, NewbpAbatementOrderEntity newNewbpAbatementOrderDetails) throws Exception {
		
		NewbpAbatementOrderEntity newNewbpAbatementOrder = new NewbpAbatementOrderEntity();
		
		try {
			//search
			newNewbpAbatementOrder = newaorepo.findById(newao_id).get();
			
			//update
			newNewbpAbatementOrder.setStatus(newNewbpAbatementOrderDetails.getStatus());
			
			//save
			return newaorepo.save(newNewbpAbatementOrder);
		
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + newao_id + "Does not Exist!");
		}
	}
}
