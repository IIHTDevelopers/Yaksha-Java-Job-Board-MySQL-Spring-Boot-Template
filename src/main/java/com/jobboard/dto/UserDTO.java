package com.jobboard.dto;

import java.util.List;

public class UserDTO {
	private Long id;

	private String name;

	private String phoneNumber;

	private String email;

	private List<Long> appliedJobs;

	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String name, String phoneNumber, String email, List<Long> appliedJobs) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.appliedJobs = appliedJobs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Long> getAppliedJobs() {
		return appliedJobs;
	}

	public void setAppliedJobs(List<Long> appliedJobs) {
		this.appliedJobs = appliedJobs;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", appliedJobs=" + appliedJobs + "]";
	}
}
