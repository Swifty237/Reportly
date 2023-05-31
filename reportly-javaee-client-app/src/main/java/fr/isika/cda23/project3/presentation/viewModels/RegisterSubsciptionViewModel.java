package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;
import java.util.List;

import fr.isika.cda.entities.esn.PaymentChoice;
import fr.isika.cda.entities.esn.Subscription;
import fr.isika.cda.entities.esn.SubscriptionState;

public class RegisterSubsciptionViewModel {

	private SubscriptionState StateOfSubscription;
	private Date endAt;
	private Date startAt = new Date();
	private boolean automaticRenewal;
	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	private PaymentChoice typeOfPayment;

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

	public SubscriptionState getStateOfSubscription() {
		return StateOfSubscription;
	}

	public void setStateOfSubscription(SubscriptionState stateOfSubscription) {
		StateOfSubscription = stateOfSubscription;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterSubsciptionViewModel [StateOfSubscription=");
		builder.append(StateOfSubscription);
		builder.append(", endAt=");
		builder.append(endAt);
		builder.append(", automaticRenewal=");
		builder.append(automaticRenewal);
		builder.append(", typeOfPayment=");
		builder.append(typeOfPayment);
		builder.append("]");
		return builder.toString();
	}

}
