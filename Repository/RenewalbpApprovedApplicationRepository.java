package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.RenewalbpApprovedApplicationEntity;

@Repository
public interface RenewalbpApprovedApplicationRepository extends JpaRepository<RenewalbpApprovedApplicationEntity, Integer>{

	//define query
}
