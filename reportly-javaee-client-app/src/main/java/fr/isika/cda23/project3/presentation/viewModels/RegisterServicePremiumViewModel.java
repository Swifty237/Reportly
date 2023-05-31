package fr.isika.cda23.project3.presentation.viewModels;

import fr.isika.cda.entities.esn.CustomDesignDetails;

public class RegisterServicePremiumViewModel {
	
	public CustomDesignDetails customDesignDetails;

	public CustomDesignDetails getCustomDesignDetails() {
		return customDesignDetails;
	}

	public void setCustomDesignDetails(CustomDesignDetails customDesignDetails) {
		this.customDesignDetails = customDesignDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterServicePremiumViewModel [customDesignDetails=");
		builder.append(customDesignDetails);
		builder.append("]");
		return builder.toString();
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
