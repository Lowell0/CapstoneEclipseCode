package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.NewbpAbatementOrderEntity;

@Repository
public interface NewbpAbatementOrderRepository extends JpaRepository<NewbpAbatementOrderEntity, Integer>{
	

	//define query
}
