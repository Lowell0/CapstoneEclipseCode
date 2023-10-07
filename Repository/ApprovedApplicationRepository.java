package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.ApprovedApplicationEntity;

@Repository
public interface ApprovedApplicationRepository extends JpaRepository<ApprovedApplicationEntity, Integer> {

	
	//define query
	//ApprovedApplicationEntity findByApplication_no(int application_no);
	
}
