package fr.isika.cda.entities.common;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "documents")
public class Document implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 131223905024286840L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String Name;
	
	@Enumerated(EnumType.STRING)
	private DocumentType TypeOfDoc;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date DocCreation;
}
