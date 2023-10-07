package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.NewApplicationEntity;

@Repository
public interface NewApplicationRepository extends JpaRepository<NewApplicationEntity, Integer> {

}


