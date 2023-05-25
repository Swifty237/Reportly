package fr.isika.cda23.entities.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7519432927046386372L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Date CreationDate;
	private String Brand;
	private String Email;

}
