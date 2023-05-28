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

    // Constructeur
    public ContractDetails(Date creationDate, Date startAt, Date endAt, ContractType typeOfContract) {
        this.creationDate = creationDate;
        this.startAt = startAt;
        this.endAt = endAt;
        this.typeOfContract = typeOfContract;
    }
}

