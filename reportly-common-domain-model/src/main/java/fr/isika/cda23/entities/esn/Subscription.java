package fr.isika.cda23.entities.esn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 131223905024286840L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long id;
	
	@Enumerated(EnumType.STRING)
    private SubscriptionState state;
	
	@Column(name = "start_at")
    private Date startAt;
	
	@Column(name = "end_at")
    private Date endAt;
	
	@Column(name = "automatic_renewal")
    private boolean automaticRenewal;
	
	@Column(name = "type_of_payment")
    private PaymentChoice typeOfPayment;
}
