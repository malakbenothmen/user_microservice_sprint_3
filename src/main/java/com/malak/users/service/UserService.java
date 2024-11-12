package com.malak.users.service;

import java.util.List;

import com.malak.users.entities.Role;
import com.malak.users.entities.User;
import com.malak.users.service.register.RegistationRequest;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	User registerUser(RegistationRequest request);
	public void sendEmailUser(User u, String code) ;
	public User validateToken(String code);

}
