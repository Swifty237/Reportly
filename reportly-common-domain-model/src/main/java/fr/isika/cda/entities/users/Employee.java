package fr.isika.cda.entities.users;

import java.io.Serializable;
import java.util.ArrayList;
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

	public Employee(String email, String password, int tjm, String skills, String name, String firstname) {
		this.password = password;
		this.email = email;
		this.tjm = tjm;
		this.skills = skills;

		this.pers = new PersonalDetails(name, firstname);

	}

}
