package fr.isika.cda23.project3.presentation.viewModels;

public class CraByStatusValuesViewModel {

	
	private long nbCrasInDeniedState;
	private long nbCrasInValidatedState;
	
	public long getNbCrasInDeniedState() {
		return nbCrasInDeniedState;
	}
	public void setNbCrasInDeniedState(long nbCrasInDeniedState) {
		this.nbCrasInDeniedState = nbCrasInDeniedState;
	}
	public long getNbCrasInValidatedState() {
		return nbCrasInValidatedState;
	}
	public void setNbCrasInValidatedState(long nbCrasInValidatedState) {
		this.nbCrasInValidatedState = nbCrasInValidatedState;
	}
}
