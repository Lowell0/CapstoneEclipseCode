package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.RenewalbpClosureOrderEntity;
import com.bfpoms.bfpoms.Repository.RenewalbpClosureOrderRepository;

@Service
public class RenewalbpClosureOrderService {

	@Autowired
	RenewalbpClosureOrderRepository renewcorepo;
	
	//read all records
	public List<RenewalbpClosureOrderEntity> getAllRenewalbpClosureOrder(){
		return renewcorepo.findAll();
	}
	
	//update records
	public RenewalbpClosureOrderEntity putRenewalbpClosureOrder(int renewco_id, RenewalbpClosureOrderEntity newRenewalbpClosureOrderDetails) throws Exception{
		
		RenewalbpClosureOrderEntity newRenewalbpClosureOrder = new RenewalbpClosureOrderEntity();
		
		try {
			//search 
			newRenewalbpClosureOrder = renewcorepo.findById(renewco_id).get();
			
			//update
			newRenewalbpClosureOrder.setStatus(newRenewalbpClosureOrderDetails.getStatus());
			
			//save
			return renewcorepo.save(newRenewalbpClosureOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + renewco_id + "Does not Exist!");
		}
	}
}
