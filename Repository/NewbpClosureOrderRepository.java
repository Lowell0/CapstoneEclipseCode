package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.NewbpClosureOrderEntity;

@Repository
public interface NewbpClosureOrderRepository extends JpaRepository<NewbpClosureOrderEntity, Integer> {

	//define query
}
