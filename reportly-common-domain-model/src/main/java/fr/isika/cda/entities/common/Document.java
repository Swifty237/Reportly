package fr.isika.cda.entities.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name ="documents")
public class Document implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2256518288828075026L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Enumerated(EnumType.STRING)
	private DocumentType typeOfDoc;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "doc_creation")
	private Date docCreation;

	public Document() {
		super();
		
	}
	
	
	
}
