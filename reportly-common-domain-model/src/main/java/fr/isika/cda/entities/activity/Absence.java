package fr.isika.cda.entities.activity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import fr.isika.cda.entities.common.Document;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Absence extends Activity implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -7508142804908681675L;

	@Enumerated(EnumType.STRING)
	private AbsenceType typeOfAbsence;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Document document;
}