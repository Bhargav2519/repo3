package com.krivis.userservice.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krivis.userservice.entity.Users;
import com.krivis.userservice.repository.UserRepository;
import com.krivis.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Users> getAllUsers() {

		return (List<Users>) userRepository.findAll();
	}

	@Override
	public Users getUserById(int iduser) {

		return userRepository.findById(iduser).orElse(null);
	}

	@Override
	public Users addorUpdateUser(Users user) {

		return userRepository.save(user);
	}

	@Override
	public Users deleteUser(int iduser) throws Exception {
		Users deletedUser = null;
		try {
			deletedUser = userRepository.findById(iduser).orElse(null);
			if(deletedUser == null) {
				throw new Exception("user not available");
			}else {
				userRepository.deleteById(iduser);
			}
		}
		catch(Exception ex) {
			throw ex;
			
		}
		return  deletedUser;
		
	}

}
