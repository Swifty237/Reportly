package fr.isika.cda.entities.esn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 131223905024286840L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column
	private String name;

	@Enumerated(EnumType.STRING)
	private SubscriptionState StateOfSubscription;

	@Temporal(TemporalType.TIMESTAMP)
	private Date StartAt;

	@Temporal(TemporalType.TIMESTAMP)
	private Date EndAt;

	@Column(name = "automatic_renewal")
	private boolean automaticRenewal;

	@Enumerated(EnumType.STRING)
	@Column(name = "type_of_payment")
	private PaymentChoice typeOfPayment;

	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;

	@OneToOne
	private ServiceBasic serviceBasic;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SubscriptionState getStateOfSubscription() {
		return StateOfSubscription;
	}

	public void setStateOfSubscription(SubscriptionState stateOfSubscription) {
		StateOfSubscription = stateOfSubscription;
	}

	public Date getStartAt() {
		return StartAt;
	}

	public void setStartAt(Date startAt) {
		StartAt = startAt;
	}

	public Date getEndAt() {
		return EndAt;
	}

	public void setEndAt(Date endAt) {
		EndAt = endAt;
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

	public Long getId() {
		return Id;
	}
	
}
