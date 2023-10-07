package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.RenewalbpAbatementOrderEntity;

@Repository
public interface RenewalbpAbatementOrderRepository extends JpaRepository<RenewalbpAbatementOrderEntity, Integer> {

	//define query
}
