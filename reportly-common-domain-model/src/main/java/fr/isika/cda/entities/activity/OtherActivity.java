package fr.isika.cda.entities.activity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.OneToOne;
=======
>>>>>>> 60f67bc (bug resolving commit)
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
<<<<<<< HEAD
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Document document;

=======
>>>>>>> 60f67bc (bug resolving commit)
}
