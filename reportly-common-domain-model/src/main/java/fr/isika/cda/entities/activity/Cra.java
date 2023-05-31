package fr.isika.cda.entities.activity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fr.isika.cda.entities.users.Employee;

@Entity
public class Cra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1890621899272474554L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	

	@Enumerated(EnumType.STRING)
	private CraState state;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modificationDate;

	public Long getId() {
		return id;
	}



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

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
