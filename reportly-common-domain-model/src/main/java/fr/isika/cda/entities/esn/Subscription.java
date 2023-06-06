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

	
	@Enumerated(EnumType.STRING)
	private SubscriptionState StateOfSubscription;


	@Column(name = "start_at")
	@Temporal(TemporalType.DATE)
	private Date startAt;

	@Column(name = "end_at")
	@Temporal(TemporalType.DATE)
	private Date endAt;

	@Column(name = "automatic_renewal")
	private boolean automaticRenewal;

	@Enumerated(EnumType.STRING)
	@Column(name = "type_of_payment")
	private PaymentChoice typeOfPayment;

	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;

	@OneToOne
	private ServiceBasic serviceBasic;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
	
	
	
	
	
	
	

}
