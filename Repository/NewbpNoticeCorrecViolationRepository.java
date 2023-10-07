package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.NewbpNoticeCorrectViolationEntity;

@Repository
public interface NewbpNoticeCorrecViolationRepository extends JpaRepository<NewbpNoticeCorrectViolationEntity, Integer> {
	

	//define query
}
