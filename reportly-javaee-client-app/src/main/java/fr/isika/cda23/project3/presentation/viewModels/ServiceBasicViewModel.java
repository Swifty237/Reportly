package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.esn.ServiceDetails;

public class ServiceBasicViewModel {

	private Long id;

	private boolean enabled;

	private Date creationDate;

	private double price;

	private ServiceDetails serviceDetails;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ServiceDetails getServiceDetails() {
		return serviceDetails;
	}

	public void setServiceDetails(ServiceDetails serviceDetails) {
		this.serviceDetails = serviceDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceBasicViewModel [id=");
		builder.append(id);
		builder.append(", enabled=");
		builder.append(enabled);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", price=");
		builder.append(price);
		builder.append(", serviceDetails=");
		builder.append(serviceDetails);
		builder.append("]");
		return builder.toString();
	}

}
