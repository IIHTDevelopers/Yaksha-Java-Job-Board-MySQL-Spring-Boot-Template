package com.jobboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobboard.service.JobService;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	private final JobService jobService = null;
}
