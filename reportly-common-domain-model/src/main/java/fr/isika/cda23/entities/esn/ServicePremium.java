package fr.isika.cda23.entities.esn;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "service_premium")
public class ServicePremium extends ServiceBasic implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3535761202462835710L;
    
}