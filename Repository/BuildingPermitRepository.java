package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.BuildingPermitEntity;

@Repository
public interface BuildingPermitRepository extends JpaRepository<BuildingPermitEntity, Integer> {

}
