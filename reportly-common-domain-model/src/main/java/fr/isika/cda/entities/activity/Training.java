package fr.isika.cda.entities.activity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Training extends Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2332810010998695804L;
	
	@Id
@GeneratedValue
	private Long id;
	public Long getId() {
		return id;
	}
	
	public TrainingType getTypeOfTraining() {
		return typeOfTraining;
	}
	public void setTypeOfTraining(TrainingType typeOfTraining) {
		this.typeOfTraining = typeOfTraining;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Enumerated(EnumType.STRING)
	private TrainingType typeOfTraining;

}
