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

	@OneToOne(cascade = CascadeType.ALL)
	private ServiceBasic serviceBasic;

}
