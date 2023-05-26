package fr.isika.cda.entities.activity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name ="id")
public class Duty extends Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1456589151243457726L;

	@Enumerated(EnumType.STRING)
	private DutyType typeOfDuty;

}
