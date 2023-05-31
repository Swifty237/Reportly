package fr.isika.cda.entities.esn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	private boolean AutomaticRenewal;
	
	@Enumerated(EnumType.STRING)
	private PaymentChoice TypeOfPayment;

	@Column(name = "start_at")
	@Temporal(TemporalType.DATE)
	private Date startAt;

	@Column(name = "end_at")
	@Temporal(TemporalType.DATE)
	private Date endAt;

	@Column(name = "automatic_renewal")
	private boolean automaticRenewal;

	@Column(name = "type_of_payment")
	private PaymentChoice typeOfPayment;


	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;

	@OneToOne(cascade = CascadeType.ALL)
	public ServiceBasic serviceBasic;
	public Subscription() {
		super();
		
	}

	public Long getId() {
		return id;
	}

	public SubscriptionState getState() {
		return state;
	}

	public void setState(SubscriptionState state) {
		this.state = state;
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

	public PaymentChoice getTypeOfPayment() {
		return typeOfPayment;
	}

	public void setTypeOfPayment(PaymentChoice typeOfPayment) {
		this.typeOfPayment = typeOfPayment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subscription [id=");
		builder.append(id);
		builder.append(", state=");
		builder.append(state);
		builder.append(", startAt=");
		builder.append(startAt);
		builder.append(", endAt=");
		builder.append(endAt);
		builder.append(", automaticRenewal=");
		builder.append(automaticRenewal);
		builder.append(", typeOfPayment=");
		builder.append(typeOfPayment);
		builder.append(", esn=");
		builder.append(esn);
		builder.append("]");
		return builder.toString();
	}
	
	



}
