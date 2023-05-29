package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.common.DocumentType;

public class AddDocumentViewModel {

	private String name;
	private DocumentType typeOfDoc;
	private Date docCreation;
		
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddDocumentViewModel [name=");
		builder.append(name);
		builder.append(",typeOfDoc=");
		builder.append(typeOfDoc);
		builder.append(", docCreation=");
		builder.append(docCreation);
		builder.append("]");
		return builder.toString();
	}
}
