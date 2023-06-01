package fr.isika.cda23.project3.business;

<<<<<<< HEAD
import java.util.Date;

=======
>>>>>>> 54dbdcd (user)
import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.AdressDetails;
<<<<<<< HEAD
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda.entities.esn.Esn;
//import fr.isika.cda23.project3.presentation.managedBeans.AddDocumentManagedBean;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
import fr.isika.cda23.project3.repository.company.EsnDao;
=======
import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
import fr.isika.cda23.project3.repository.EsnDao;
import fr.isika.cda23.project3.repository.user.UserDao;
>>>>>>> 54dbdcd (user)

@Stateless
public class RegisterEsnService {

	@Inject
	private EsnDao esnDao;

<<<<<<< HEAD
//	@Inject
//	private AddDocumentManagedBean addDocumentManagedBean;

	private static Document document;

	public void register(RegisterEsnViewModel viewModel) {

=======
	public void register(RegisterEsnViewModel viewModel) {
		Esn esn = new Esn();
		
<<<<<<< HEAD
>>>>>>> 54dbdcd (user)
		AdressDetails adressDetails = new AdressDetails();
		adressDetails.setAdress(viewModel.getAdress());
		adressDetails.setCity(viewModel.getCity());
		adressDetails.setCountry(viewModel.getCountry());
		adressDetails.setPostalCode(viewModel.getPostalCode());
=======
//		AdressDetails adressDetails = new AdressDetails();
//		adressDetails.setAdress(viewModel.getAdress());
//		adressDetails.setCity(viewModel.getCity());
//		adressDetails.setCountry(viewModel.getCountry());
//		adressDetails.setPostalCode(viewModel.getPostalCode());
//		
//		CompanyDetails
>>>>>>> 3cd4aa3 (subscription company)

<<<<<<< HEAD
		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setBrand(viewModel.getBrand());
		companyDetails.setEmail(viewModel.getEmail());
		companyDetails.setPassword(viewModel.getPassword());
		companyDetails.setCreationDate(new Date());
		companyDetails.setAdressDetails(adressDetails);

		companyDetails.setDocument(document);

		Esn esn = new Esn();

		esn.setCompanyDetails(companyDetails);

		Long id = esnDao.register(esn);

		System.out.println("Esn vient d'etre crée avec :" + id);

	}

	public static void getDoc(Document doc) {
		doc.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
		doc.setDocCreation(new Date());
		document = doc;
=======
>>>>>>> 54dbdcd (user)
	}
}
