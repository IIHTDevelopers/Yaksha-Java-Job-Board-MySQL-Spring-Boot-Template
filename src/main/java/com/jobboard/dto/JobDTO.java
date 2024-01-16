package com.jobboard.dto;

public class JobDTO {
	private Long id;

	private String title;

	private String salaryBracket;

	private String location;

	private String requiredSkills;

	public JobDTO() {
		super();
	}

	public JobDTO(Long id, String title, String salaryBracket, String location, String requiredSkills) {
		super();
		this.id = id;
		this.title = title;
		this.salaryBracket = salaryBracket;
		this.location = location;
		this.requiredSkills = requiredSkills;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSalaryBracket() {
		return salaryBracket;
	}

	public void setSalaryBracket(String salaryBracket) {
		this.salaryBracket = salaryBracket;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRequiredSkills() {
		return requiredSkills;
	}

	public void setRequiredSkills(String requiredSkills) {
		this.requiredSkills = requiredSkills;
	}

	@Override
	public String toString() {
		return "JobDTO [id=" + id + ", title=" + title + ", salaryBracket=" + salaryBracket + ", location=" + location
				+ ", requiredSkills=" + requiredSkills + "]";
	}
}
