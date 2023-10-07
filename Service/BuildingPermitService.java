package com.bfpoms.bfpoms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.BuildingPermitEntity;
import com.bfpoms.bfpoms.Repository.BuildingPermitRepository;

@Service
public class BuildingPermitService {

	@Autowired
	BuildingPermitRepository bprepo;
	
	//read all records
	public List<BuildingPermitEntity> getAllBuildingPermit(){
		return bprepo.findAll();
	}
	
	//update records
	public BuildingPermitEntity putBuildingPermit(int bp_id, BuildingPermitEntity newBuildingPermitDetails) throws Exception{
		
		BuildingPermitEntity newBuildingPermit = new BuildingPermitEntity();
		
		try {
			//search
			newBuildingPermit = bprepo.findById(bp_id).get();
			
			//update
			newBuildingPermit.setControl_no(newBuildingPermitDetails.getControl_no());
			
			//save
			return bprepo.save(newBuildingPermit);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +bp_id+ "Does not Exist!");
		}
	}
}
