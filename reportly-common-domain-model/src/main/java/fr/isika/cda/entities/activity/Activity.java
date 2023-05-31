package fr.isika.cda.entities.activity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Activity implements Serializable {

	private static final long serialVersionUID = -8098047044102899069L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@Temporal(TemporalType.DATE)
	protected Date startAt;

	@Temporal(TemporalType.DATE)
	protected Date endAt;

	protected int overtime;

	protected String description;
	
	@Temporal(TemporalType.DATE)
	protected Date createDate;

	protected Boolean onCall;

	public Activity() {
		super();
		
	}

	
	
}
