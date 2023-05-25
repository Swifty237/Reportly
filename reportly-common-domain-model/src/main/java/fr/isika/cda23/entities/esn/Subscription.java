package fr.isika.cda23.entities.esn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date StartAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date EndAt;
	
	private boolean AutomaticRenewal;
	
	@Enumerated(EnumType.STRING)
	private PaymentChoice TypeOfPayment;
}
