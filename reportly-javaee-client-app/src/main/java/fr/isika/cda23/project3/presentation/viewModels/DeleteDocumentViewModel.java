package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.common.DocumentType;

public class DeleteDocumentViewModel {

	private Long id;
	private String name;
	private DocumentType typeOfDoc;
	private Date docCreation;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DocumentType getTypeOfDoc() {
		return typeOfDoc;
	}
	public void setTypeOfDoc(DocumentType typeOfDoc) {
		this.typeOfDoc = typeOfDoc;
	}
	public Date getDocCreation() {
		return docCreation;
	}
	public void setDocCreation(Date docCreation) {
		this.docCreation = docCreation;
	}
}
