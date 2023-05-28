package fr.isika.cda.entities.esn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.contract.Customer;

@Entity
public class ESN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8800472236917589265L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL )
	private Subscription subscription;
	
	@OneToOne(cascade = CascadeType.ALL)
  
    private CompanyDetails companyDetails;


	@OneToMany
	private List<Customer> customerList=new ArrayList<>();
}
