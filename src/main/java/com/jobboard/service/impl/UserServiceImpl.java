package com.jobboard.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobboard.dto.JobDTO;
import com.jobboard.dto.UserDTO;
import com.jobboard.exception.NotFoundException;
import com.jobboard.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<UserDTO> getAllUsers() {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO getUserById(Long userId) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO createUser(UserDTO user) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO updateUser(Long userId, UserDTO updatedUser) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteUser(Long userId) throws NotFoundException {
		// write your logic here
		return false;
	}

	@Override
	public UserDTO applyForJob(Long userId, Long jobId) {
		// write your logic here
		return null;
	}

	@Override
	public List<JobDTO> getAppliedJobsByUserId(Long userId) {
		// write your logic here
		return null;
	}
}
