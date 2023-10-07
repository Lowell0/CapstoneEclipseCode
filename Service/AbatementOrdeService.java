package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.AbatementOrderEntity;
import com.bfpoms.bfpoms.Repository.AbatementOrderRepository;

@Service
public class AbatementOrdeService {
	
	@Autowired
	AbatementOrderRepository aorepo;
	
	//read all records
	public List<AbatementOrderEntity> getAllAbatementOrder(){
		return aorepo.findAll();
		
	}
	
	//update records
	public AbatementOrderEntity putAbatementOrder(int ao_id, AbatementOrderEntity newAbatementOrderDetails) throws Exception{
		
		AbatementOrderEntity newAbatementOrder = new AbatementOrderEntity();
		
		try {
			//search
			newAbatementOrder = aorepo.findById(ao_id).get();
			
			//update
			newAbatementOrder.setStatus(newAbatementOrderDetails.getStatus());
			
			//save
			return aorepo.save(newAbatementOrder);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +ao_id+ "Does not Exist!");
		}
		
	}
	
	

}
