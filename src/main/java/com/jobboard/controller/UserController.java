package com.jobboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobboard.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserService userService = null;
}
