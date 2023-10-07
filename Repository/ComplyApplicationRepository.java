package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.ComplyApplicationEntity;

@Repository
public interface ComplyApplicationRepository extends JpaRepository<ComplyApplicationEntity, Integer>{


}
