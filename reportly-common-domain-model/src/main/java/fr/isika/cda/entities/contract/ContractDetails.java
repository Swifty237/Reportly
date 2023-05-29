package fr.isika.cda.entities.contract;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class ContractDetails implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 2897179663026584445L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @Temporal(TemporalType.DATE)
    private Date startAt;

    @Temporal(TemporalType.DATE)
    private Date endAt;

    @Enumerated(EnumType.STRING)
    private ContractType typeOfContract;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	public ContractType getTypeOfContract() {
		return typeOfContract;
	}

	public void setTypeOfContract(ContractType typeOfContract) {
		this.typeOfContract = typeOfContract;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContractDetails [id=");
		builder.append(id);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", startAt=");
		builder.append(startAt);
		builder.append(", endAt=");
		builder.append(endAt);
		builder.append(", typeOfContract=");
		builder.append(typeOfContract);
		builder.append("]");
		return builder.toString();
	}
}

