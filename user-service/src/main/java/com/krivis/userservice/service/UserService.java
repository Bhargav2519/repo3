package com.krivis.userservice.service;
import java.util.List;

import com.krivis.userservice.entity.Users;
public interface UserService {
	
	
	public List<Users> getAllUsers();
	public Users getUserById(int iduser);
	public Users addorUpdateUser(Users user);

	public Users deleteUser(int iduser) throws Exception;
}
