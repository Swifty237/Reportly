package fr.isika.cda.entities.esn;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ESN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8800472236917589265L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
}
