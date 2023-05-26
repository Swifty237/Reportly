package fr.isika.cda.entities.contract;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Contract implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 4201743641123277277L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private ContractDetails contractDetails;
    
    @Enumerated(EnumType.STRING)
    private ContractState stateOfContract;
 
}