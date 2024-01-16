package com.jobboard.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jobboard.dto.JobDTO;
import com.jobboard.exception.NotFoundException;
import com.jobboard.service.JobService;

import jakarta.transaction.Transactional;

@Service
public class JobServiceImpl implements JobService {

	@Override
	public Page<JobDTO> getAllJobs(Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public JobDTO getJobById(Long jobId) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public JobDTO createJob(JobDTO jobDTO) {
		// write your logic here
		return null;
	}

	@Override
	@Transactional
	public JobDTO updateJob(Long jobId, JobDTO jobDTO) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteJob(Long jobId) throws NotFoundException {
		// write your logic here
		return false;
	}

	@Override
	public List<JobDTO> getJobsByLocation(String location) {
		// write your logic here
		return null;
	}

}
