/*package com.bfpoms.bfpoms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.UserActivityEntity;
import com.bfpoms.bfpoms.Service.UserActivityService;

@RestController
@CrossOrigin
@RequestMapping("/useractivity")
public class UserActivityController {
	
	@Autowired
	UserActivityService useractserv;

	@GetMapping("/activities")
	public List<UserActivityEntity> getAllUserActivities() {
		return useractserv.getAllUserActivities();
	}
	
	@PostMapping("/log-activity")
	public ResponseEntity<String> logUserActivity(@RequestBody UserActivityEntity activity) {
		useractserv.logUserActivity(activity);
		return ResponseEntity.ok("Activity Logged Successfully");
	}

}*/
