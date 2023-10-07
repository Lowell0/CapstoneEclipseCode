package com.bfpoms.bfpoms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfpoms.bfpoms.Entity.RenewalbpNoticeComplyEntity;

@Repository
public interface RenewalbpNoticeComplyRepository extends JpaRepository<RenewalbpNoticeComplyEntity, Integer> {

	//define query
}
