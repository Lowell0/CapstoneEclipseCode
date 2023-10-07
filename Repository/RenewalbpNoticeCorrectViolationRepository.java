package com.bfpoms.bfpoms.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.RenewalbpNoticeCorrectViolationEntity;

@Repository
public interface RenewalbpNoticeCorrectViolationRepository extends JpaRepository<RenewalbpNoticeCorrectViolationEntity, Integer>{

	//define query
}
