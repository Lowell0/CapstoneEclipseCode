package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.NewbpNoticeComplyEntity;


@Repository
public interface NewbpNoticeComplyRepository extends JpaRepository<NewbpNoticeComplyEntity, Integer>{

	//define query
	
}
