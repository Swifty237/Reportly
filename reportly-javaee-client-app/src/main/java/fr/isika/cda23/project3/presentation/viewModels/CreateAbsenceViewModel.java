package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.activity.AbsenceType;

public class CreateAbsenceViewModel {

	private String nomSalarié;
	private AbsenceType typeAbsence ;
	private Date creationDate ; 
	public AbsenceType getTypeAbsence() {
		return typeAbsence;
	}
	public void setTypeAbsence(AbsenceType typeAbsence) {
		this.typeAbsence = typeAbsence;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getStartAt() {
		return startAt;
	}
	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}
	public Date getEndAt() {
		return endAt;
	}
	
	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private Date startAt ;
	private Date endAt ; 
	private String description ; 
@Override
public String toString() {
	return "CreateAbsenceViewModel [typeAbsence=" + typeAbsence + ", creationDate=" + creationDate + ", startAt="
			+ startAt + ", endAt=" + endAt + ", description=" + description + "]";
}
public String getNomSalarié() {
	return nomSalarié;
}
public void setNomSalarié(String nomSalarié) {
	this.nomSalarié = nomSalarié;
}
}