package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.AbatementOrderEntity;

@Repository
public interface AbatementOrderRepository extends JpaRepository<AbatementOrderEntity, Integer> {

}
