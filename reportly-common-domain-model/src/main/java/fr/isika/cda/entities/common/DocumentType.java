package fr.isika.cda.entities.common;

public enum DocumentType {
	
	ESN_CERTIFICATION ("Cerfitifcation ESN"),
	SICK_LEAVE ("Sickness Leave"),
	OTHER_ACTIVITY ("Other Activity"),
	EXPENSE_REPORT_INVOICE ("Invoice for an expense report"), 
	SUBSCRIPTION_INVOICE ("Invoice for subscription");
	
	private String label;
	
	private DocumentType(final String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
