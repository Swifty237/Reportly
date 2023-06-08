package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.activity.Cra;
import fr.isika.cda.entities.activity.DutyType;
import fr.isika.cda.entities.activity.TrainingType;
import fr.isika.cda.entities.contract.Customer;

public class ActivityViewModel {

	private Long id;
	private Date startAt;
	private Date endAt;
	private int overtime;
	private String description;
	private Date createDate;
	private Boolean onCall;
	private Customer customer;
	private Cra cra;
	private DutyType typeOfDuty;
	private TrainingType trainingType;
	
	public Long getId() {
		return id;
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
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Boolean getOnCall() {
		return onCall;
	}
	public void setOnCall(Boolean onCall) {
		this.onCall = onCall;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Cra getCra() {
		return cra;
	}
	public void setCra(Cra cra) {
		this.cra = cra;
	}
	public DutyType getTypeOfDuty() {
		return typeOfDuty;
	}
	public void setTypeOfDuty(DutyType typeOfDuty) {
		this.typeOfDuty = typeOfDuty;
	}
	public TrainingType getTrainingType() {
		return trainingType;
	}
	public void setTrainingType(TrainingType trainingType) {
		this.trainingType = trainingType;
	}
}
