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
	private Long id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private DocumentType TypeOfDoc;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date docCreation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DocumentType getTypeOfDoc() {
		return TypeOfDoc;
	}

	public void setTypeOfDoc(DocumentType typeOfDoc) {
		TypeOfDoc = typeOfDoc;
	}

	public Date getDocCreation() {
		return docCreation;
	}

	public void setDocCreation(Date docCreation) {
		this.docCreation = docCreation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Document [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", TypeOfDoc=");
		builder.append(TypeOfDoc);
		builder.append(", docCreation=");
		builder.append(docCreation);
		builder.append("]");
		return builder.toString();
	}
	
	
}
