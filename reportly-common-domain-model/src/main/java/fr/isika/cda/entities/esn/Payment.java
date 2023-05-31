package fr.isika.cda.entities.esn;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import fr.isika.cda.entities.common.Document;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)   
public abstract class Payment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8429719138674322450L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Document document;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
}
