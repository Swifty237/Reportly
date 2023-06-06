package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.activity.CraState;
import fr.isika.cda.entities.users.Employee;

public class RegisterCraViewModel {

	
private Long id;
	
	
	public Employee employee;

	
	private CraState state;

	
	private Date creationDate;

	
	private Date modificationDate;

	public CraState getState() {
		return state;
	}

	public void setState(CraState state) {
		this.state = state;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
}
