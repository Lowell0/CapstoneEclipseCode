package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.RenewalbpAbatementOrderEntity;
import com.bfpoms.bfpoms.Repository.RenewalbpAbatementOrderRepository;

@Service
public class RenewalbpAbatementOrderService {
	
	@Autowired
	RenewalbpAbatementOrderRepository renewaorepo;
	
	
	//read all records
	public List<RenewalbpAbatementOrderEntity> getAllRenewalbpAbatementOrder(){
		return renewaorepo.findAll();
	}
	
	//update records
	public RenewalbpAbatementOrderEntity putRenewalbpAbatementOrder(int renewao_id, RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		
		RenewalbpAbatementOrderEntity newRenewalbpAbatementOrder = new RenewalbpAbatementOrderEntity(); 
		
		try {
			//search
			newRenewalbpAbatementOrder = renewaorepo.findById(renewao_id).get();
			
			//update
			newRenewalbpAbatementOrder.setStatus(newRenewalbpAbatementOrderDetails.getStatus());
			
			//save
			return renewaorepo.save(newRenewalbpAbatementOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + renewao_id + "Does not Exist!");
		}
	}
	

}
