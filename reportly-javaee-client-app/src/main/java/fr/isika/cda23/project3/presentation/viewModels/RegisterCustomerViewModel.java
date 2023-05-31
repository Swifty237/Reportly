package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;
import java.util.List;

import fr.isika.cda.entities.contract.Customer;

public class RegisterCustomerViewModel {
	private long CustomerId;
	private String brand;
	private String email;
	private Date creationDate;
	private String adress;
	private String postalCode;
	private String city;
	private String country;
	private int PhoneNumber;
	List<Customer> customers;
	public long getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddCustomerViewModel [CustomerId=");
		builder.append(CustomerId);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", email=");
		builder.append(email);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", adress=");
		builder.append(adress);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", city=");
		builder.append(city);
		builder.append(", country=");
		builder.append(country);
		builder.append(", PhoneNumber=");
		builder.append(PhoneNumber);
		builder.append(", customers=");
		builder.append(customers);
		builder.append("]");
		return builder.toString();
	}
	
}
