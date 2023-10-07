package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.DisaprovalApplicationEntity;

@Repository
public interface DisaprovalApplicationRepository extends JpaRepository<DisaprovalApplicationEntity, Integer> {
	
	//define query
	//DisaprovalApplicationEntity findByApplication_no();

}
