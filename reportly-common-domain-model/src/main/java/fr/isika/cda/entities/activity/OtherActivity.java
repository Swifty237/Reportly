package fr.isika.cda.entities.activity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class OtherActivity extends Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3488616321439609965L;


	private String name;

}
