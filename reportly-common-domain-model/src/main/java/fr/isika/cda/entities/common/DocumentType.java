package fr.isika.cda.entities.common;

public enum DocumentType {
	
	ESN_CERTIFICATION ("Kbis ESN"),
	SICK_LEAVE ("Arrêt Maladie"),
	OTHER_ACTIVITY ("Autres justificatifs"),
	EXPENSE_REPORT_INVOICE ("Notes de frais"), 
	SUBSCRIPTION_INVOICE ("Facture abonnement");
	
	private String label;
	
	private DocumentType(final String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
