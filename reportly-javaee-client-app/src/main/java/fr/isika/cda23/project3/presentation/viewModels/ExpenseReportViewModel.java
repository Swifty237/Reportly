package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

public class ExpenseReportViewModel {

	private Long id;
	private Date ExpenseDate;
	private Date CreationDate;
	private String Reason;
	private Double Amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getExpenseDate() {
		return ExpenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		ExpenseDate = expenseDate;
	}

	public Date getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExpenseReportViewModel [id=");
		builder.append(id);
		builder.append(", ExpenseDate=");
		builder.append(ExpenseDate);
		builder.append(", CreationDate=");
		builder.append(CreationDate);
		builder.append(", Reason=");
		builder.append(Reason);
		builder.append(", Amount=");
		builder.append(Amount);
		builder.append("]");
		return builder.toString();
	}

}
