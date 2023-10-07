package com.bfpoms.bfpoms.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfpoms.bfpoms.Entity.UserEntity;
import com.bfpoms.bfpoms.Repository.UserRepository;



@Service
public class UserService {

	/* logic of the system
	 create
	 read
	 update
	 delete
	 search
	
	 * */
	
	@Autowired
	UserRepository urepo;
	
	//create or insert
	public UserEntity insertUser(UserEntity user) {
		return urepo.save(user);
	}
	
	//read all user records
	public List<UserEntity> getAllUser(){
		return urepo.findAll();
	}
	
	//read or search
	///public UserEntity findByFirstName(String firstname) {
		//if (urepo.findByFirstName(firstname) !=null)
			//return urepo.findByFirstName(firstname);
		//else
			//return null;
	//}
	
	//Update a record
	public UserEntity putUser(int id, UserEntity newUserDetails) throws Exception{
		
		UserEntity user = new UserEntity();
		
		try {
			//Steps in updating
			//Step1 - search the id number of the student
			user = urepo.findById(id).get();
			
			//Step2 - update the record
			user.setAccount_no(newUserDetails.getAccount_no());
			user.setFirstname(newUserDetails.getFirstname());
			user.setLastname(newUserDetails.getLastname());
			//user.setPassword(newUserDetails.getPassword());
			user.setAddress(newUserDetails.getAddress());
			user.setDesignation(newUserDetails.getDesignation());
			user.setEmail(newUserDetails.getEmail());
			user.setPosition(newUserDetails.getPosition());
			user.setStatus(newUserDetails.getStatus());
			
			//Step3 - save the information and return the value
			return urepo.save(user);
			
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + id + "Does not exist!");
		}
	}
	
	//DeleteUser
	public String deleteUser(int id) {
		String msg;
		if(urepo.findById(id) !=null) {
			urepo.deleteById(id);
		
			msg = "User ID Number " + id + " is successfully Deleted";	
	}
	else
			msg = "User ID Number " + id + " is Not Found!";
	
	return msg;
	
	
	}	
	
}
