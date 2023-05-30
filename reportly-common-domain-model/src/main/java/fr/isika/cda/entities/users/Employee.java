package fr.isika.cda.entities.users;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import fr.isika.cda.entities.activity.Cra;
import fr.isika.cda.entities.common.AdressDetails;
import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda.entities.common.PersonalDetails;

@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class Employee extends UserAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6240533294536565573L;

	private double tjm;
	private boolean busy;
	private String skills;

	
	@OneToMany
	private List<Cra> craList=new ArrayList<>();
	
	@OneToMany
	private List<ExpenseReport> expenseReportsList=new ArrayList<>();
	
	public Employee() {
		
	}

	public Employee(String email, String password, double tjm, String name, String firstname,String adress,String city,String country,String postalCode,Date birthday, int phoneNumber, String jobTitle) {
		this.password = password;
		this.email = email;
		this.tjm = tjm;
		this.skills = null;
		this.busy=false;

		this.pers = new PersonalDetails(name,firstname,birthday,phoneNumber,jobTitle);
		this.pers.adressDetails=new AdressDetails(adress,postalCode,city,country);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [tjm=");
		builder.append(tjm);
		builder.append(", busy=");
		builder.append(busy);
		builder.append(", skills=");
		builder.append(skills);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", pers=");
		builder.append(pers);
		builder.append("]");
		return builder.toString();
	}

	public double getTjm() {
		return tjm;
	}

	public void setTjm(double tjm) {
		this.tjm = tjm;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}


	
	

}
