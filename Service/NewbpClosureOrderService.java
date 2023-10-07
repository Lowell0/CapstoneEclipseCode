package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.NewbpClosureOrderEntity;
import com.bfpoms.bfpoms.Repository.NewbpClosureOrderRepository;

@Service
public class NewbpClosureOrderService {
	
	@Autowired
	NewbpClosureOrderRepository newcorepo;

	
	//read all records
	public List<NewbpClosureOrderEntity> getAllNewbpClosureOrder(){
		return newcorepo.findAll();
		
	}
	
	//update records
	public NewbpClosureOrderEntity putNewbpClosureOrder(int newco_id, NewbpClosureOrderEntity newNewbpClosureOrderDetails) throws Exception{
		
		NewbpClosureOrderEntity newNewbpClosureOrder = new NewbpClosureOrderEntity();
		
		try {
			//search
			newNewbpClosureOrder = newcorepo.findById(newco_id).get();
			
			//update
			newNewbpClosureOrder.setStatus(newNewbpClosureOrderDetails.getStatus());
			
			//save
			return newcorepo.save(newNewbpClosureOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + newco_id + "Does not Exist!");
		}
		
	}
}
