package fr.isika.cda.entities.activity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import fr.isika.cda.entities.common.Document;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class OtherActivity extends Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3488616321439609965L;

	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Document document;

}