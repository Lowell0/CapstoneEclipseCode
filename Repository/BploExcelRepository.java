package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.BploExcelEntity;

@Repository
public interface BploExcelRepository extends JpaRepository<BploExcelEntity, Integer>{

	//BploExcelEntity getAllBplo();
}
