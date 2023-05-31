package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;
import java.util.List;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.UserAccount;

public class RegisterUserViewModel {
	private long userId;
	private String name;
	private String firstname;
	private String email;
	private String password;
	private Date birthday;
	private String adress;
	private String city;
	private String postalCode;
	private String country;
	private int phoneNumber;
	private String jobTitle;
	private double tjm;
	private Employee emp;
	List<UserAccount> userAccounts;

//	
//	public RegisterUserViewModel() {
//		
//		this.emp=new Employee(this.email, this.password, this.tjm, this.name,this.firstname,this.adress,this.city,this.country,this.postalCode,this.birthday,this.phoneNumber, this.jobTitle);
//		
//	}
//

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public List<UserAccount> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(List<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

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


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getTjm() {
		return tjm;
	}

	public void setTjm(double tjm) {
		this.tjm = tjm;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterUserViewModel [userId=");
		builder.append(userId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", adress=");
		builder.append(adress);
		builder.append(", city=");
		builder.append(city);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", country=");
		builder.append(country);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", jobTitle=");
		builder.append(jobTitle);
		builder.append(", tjm=");
		builder.append(tjm);
		builder.append("]");
		return builder.toString();
	}

}
