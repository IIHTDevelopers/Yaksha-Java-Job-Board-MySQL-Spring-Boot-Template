package com.jobboard.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.jobboard.dto.UserDTO;
import com.jobboard.service.UserService;

import javassist.NotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<UserDTO> getAllUsers() {
		return null;
	}

	@Override
	public UserDTO getUserById(Long userId) throws NotFoundException {
		return null;
	}

	@Override
	@Transactional
	public UserDTO createUser(UserDTO user) {
		return null;
	}

	@Override
	@Transactional
	public UserDTO updateUser(Long userId, UserDTO updatedUser) throws NotFoundException {
		return null;
	}

	@Override
	public boolean deleteUser(Long userId) throws NotFoundException {
		return false;
	}

}
