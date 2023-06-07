package fr.isika.cda23.project3.presentation.viewModels;

import java.io.Serializable;
import java.util.Date;

import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda.entities.common.ExpenseReportState;

public class ExpenseReportViewModel implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = -2572134454652257059L;
	
	private Long id;
    private Date expenseDate;
    private Date creationDate;
    private String reason;
    private Double amount;
    private String fileName;
    private DocumentType documentType;
    private ExpenseReportState expenseReportState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public DocumentType getDocumentType() {
		return documentType;
	}
    public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}
    
	public ExpenseReportState getExpenseReportState() {
		return expenseReportState;
	}

	public void setExpenseReportState(ExpenseReportState expenseReportState) {
		this.expenseReportState = expenseReportState;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExpenseReportViewModel [id=");
		builder.append(id);
		builder.append(", expenseDate=");
		builder.append(expenseDate);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", reason=");
		builder.append(reason);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", fileName=");
		builder.append(fileName);
		builder.append(", documentType=");
		builder.append(documentType);
		builder.append(", expenseReportState=");
		builder.append(expenseReportState);
		builder.append("]");
		return builder.toString();
	}
}
