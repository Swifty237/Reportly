package fr.isika.cda.entities.activity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Training extends Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2332810010998695804L;

	
	@Enumerated(EnumType.STRING)
	private TrainingType typeOfTraining;

}
