package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.RenewalbpClosureOrderEntity;

@Repository
public interface RenewalbpClosureOrderRepository extends JpaRepository<RenewalbpClosureOrderEntity, Integer> {

	//define query
}
