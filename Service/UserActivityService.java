/*package com.bfpoms.bfpoms.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.UserActivityEntity;
import com.bfpoms.bfpoms.Repository.UserActivityRepository;

@Service
public class UserActivityService {


	@Autowired
	UserActivityRepository useractrepo;
	
	
	public List<UserActivityEntity> getAllUserActivities() {
		return useractrepo.findAll();
	}
	
	public UserActivityEntity logUserActivity(UserActivityEntity activity) {
		activity.setTimestamp(LocalDateTime.now());
		return useractrepo.save(activity);
	}
}*/
