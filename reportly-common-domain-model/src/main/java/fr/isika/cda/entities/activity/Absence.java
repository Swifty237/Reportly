package fr.isika.cda.entities.activity;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import fr.isika.cda.entities.common.Document;
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Absence extends Activity implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -7508142804908681675L;
	@Enumerated(EnumType.STRING)
	private AbsenceType typeOfAbsence;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Document document;
	private Long userId;
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public AbsenceType getTypeOfAbsence() {
		return typeOfAbsence;
	}
	public void setTypeOfAbsence(AbsenceType typeOfAbsence) {
		this.typeOfAbsence = typeOfAbsence;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Absence [typeOfAbsence=");
		builder.append(typeOfAbsence);
		builder.append(", startAt=");
		builder.append(startAt);
		builder.append(", endAt=");
		builder.append(endAt);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getUserId() {
		return userId;
	}
	
}