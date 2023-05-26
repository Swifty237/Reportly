package fr.isika.cda.entities.contract;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Constructeur
    public Customer(Long id) {
        this.id = id;
        
    }
}