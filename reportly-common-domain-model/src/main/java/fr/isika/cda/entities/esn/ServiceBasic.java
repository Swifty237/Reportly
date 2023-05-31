package fr.isika.cda.entities.esn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "service_basic")
@Inheritance(strategy=InheritanceType.JOINED)  
public abstract class ServiceBasic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5822356843485950304L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private boolean enabled;

	@Column(name = "creation_date")
	private Date creationDate;

	@Column(name = "price")
	private double price;
	

	@OneToOne(cascade = CascadeType.ALL ) 
	public Subscription subscription;


	public ServiceBasic() {
		super();
		
	}
	
	
	
}
