package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;



public class RegisterPersonalDetailsViewModel {
	
	
	private String name;
	private String firstname;
	private Date birthday;
	private String phoneNumber;
	private String jobTitle;
	private Date creationDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterPersonalDetailsViewModel [name=");
		builder.append(name);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", jobTitle=");
		builder.append(jobTitle);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
