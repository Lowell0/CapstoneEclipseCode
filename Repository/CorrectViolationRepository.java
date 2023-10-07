package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.CorrectViolationEntity;

@Repository
public interface CorrectViolationRepository extends JpaRepository<CorrectViolationEntity, Integer>{

}
