package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.NewbpApprovedApplicationEntity;

@Repository
public interface NewbpApprovedApplicationRepository extends JpaRepository<NewbpApprovedApplicationEntity, Integer>{
	
	//define query

}
