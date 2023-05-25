package fr.isika.cda.entities.contract;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contract {
	
    @Id
    @GeneratedValue
    private int id;
    
    @Enumerated(EnumType.STRING)
    private ContractState stateOfContract;
    
    // Constructeur
    public Contract(int id, ContractState stateOfContract) {
        this.id = id;
        this.stateOfContract = stateOfContract;
        
    }
}