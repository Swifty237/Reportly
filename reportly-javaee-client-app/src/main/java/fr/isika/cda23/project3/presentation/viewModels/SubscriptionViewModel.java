package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;
import fr.isika.cda.entities.esn.Payment;
import fr.isika.cda.entities.esn.PaymentChoice;
import fr.isika.cda.entities.esn.ServiceBasic;
import fr.isika.cda.entities.esn.SubscriptionState;

public class SubscriptionViewModel {

	
	private Long Id;

	private SubscriptionState StateOfSubscription;

	private Date startAt;

	private Date endAt;

	private boolean automaticRenewal;

	private PaymentChoice typeOfPayment;

	private Payment payment;

	private ServiceBasic serviceBasic;
	
	
	
	

	public Long getId() {
		return Id;
	}

	public SubscriptionState getStateOfSubscription() {
		return StateOfSubscription;
	}

	public void setStateOfSubscription(SubscriptionState stateOfSubscription) {
		StateOfSubscription = stateOfSubscription;
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

	public boolean isAutomaticRenewal() {
		return automaticRenewal;
	}

	public void setAutomaticRenewal(boolean automaticRenewal) {
		this.automaticRenewal = automaticRenewal;
	}

	public PaymentChoice getTypeOfPayment() {
		return typeOfPayment;
	}

	public void setTypeOfPayment(PaymentChoice typeOfPayment) {
		this.typeOfPayment = typeOfPayment;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public ServiceBasic getServiceBasic() {
		return serviceBasic;
	}

	public void setServiceBasic(ServiceBasic serviceBasic) {
		this.serviceBasic = serviceBasic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterSubsciptionViewModel [Id=");
		builder.append(Id);
		builder.append(", StateOfSubscription=");
		builder.append(StateOfSubscription);
		builder.append(", startAt=");
		builder.append(startAt);
		builder.append(", endAt=");
		builder.append(endAt);
		builder.append(", automaticRenewal=");
		builder.append(automaticRenewal);
		builder.append(", typeOfPayment=");
		builder.append(typeOfPayment);
		builder.append(", payment=");
		builder.append(payment);
		builder.append(", serviceBasic=");
		builder.append(serviceBasic);
		builder.append("]");
		return builder.toString();
	}

}
