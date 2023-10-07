package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.ClosureOrderEntity;

@Repository
public interface ClosureOrderRepository extends JpaRepository<ClosureOrderEntity, Integer> {

}
