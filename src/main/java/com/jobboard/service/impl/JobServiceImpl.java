package com.jobboard.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.jobboard.dto.JobDTO;
import com.jobboard.service.JobService;

import javassist.NotFoundException;

@Service
public class JobServiceImpl implements JobService {

	@Override
	public List<JobDTO> getAllJobs() {
		return null;
	}

	@Override
	public JobDTO getJobById(Long jobId) throws NotFoundException {
		return null;
	}

	@Override
	@Transactional
	public JobDTO createJob(JobDTO jobDTO) {
		return null;
	}

	@Override
	@Transactional
	public JobDTO updateJob(Long jobId, JobDTO jobDTO) throws NotFoundException {
		return null;
	}

	@Override
	public boolean deleteJob(Long jobId) throws NotFoundException {
		return false;
	}
}
