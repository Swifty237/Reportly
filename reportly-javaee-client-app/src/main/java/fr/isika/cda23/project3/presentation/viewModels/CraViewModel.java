package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.activity.DutyType;

public class CraViewModel {

	private Date creationDate;
	private DutyType dutyType;
	private Date endAt;
	private String description;
	private Date startAt;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public DutyType getDutyType() {
		return dutyType;
	}

	public void setDutyType(DutyType dutyType) {
		this.dutyType = dutyType;
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

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

}
