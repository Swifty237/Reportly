 package fr.isika.cda.entities.contract;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import fr.isika.cda.entities.esn.ESN;

@Entity
public class Customer implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7950833650455809665L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Constructeur
    public Customer(Long id) {
        this.id = id;
    }
    
    @ManyToOne
   
    private ESN esn;
    
    
    
    
    
    
    
    
}