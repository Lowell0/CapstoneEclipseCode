package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.BpApplicationsEntity;

@Repository
public interface BpApplicationsRepository extends JpaRepository<BpApplicationsEntity, Integer>{

}
