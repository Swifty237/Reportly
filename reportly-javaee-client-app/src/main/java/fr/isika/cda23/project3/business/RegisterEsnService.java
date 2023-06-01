package fr.isika.cda23.project3.business;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Date;

=======
>>>>>>> 54dbdcd (user)
=======
import java.util.Date;

>>>>>>> 84f94f9 (register esn ok)
import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.AdressDetails;
<<<<<<< HEAD
<<<<<<< HEAD
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda.entities.esn.Esn;
//import fr.isika.cda23.project3.presentation.managedBeans.AddDocumentManagedBean;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
import fr.isika.cda23.project3.repository.company.EsnDao;
=======
=======
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
>>>>>>> 84f94f9 (register esn ok)
import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda23.project3.presentation.managedBeans.AddDocumentManagedBean;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
<<<<<<< HEAD
import fr.isika.cda23.project3.repository.EsnDao;
import fr.isika.cda23.project3.repository.user.UserDao;
>>>>>>> 54dbdcd (user)
=======
import fr.isika.cda23.project3.repository.company.EsnDao;
>>>>>>> 84f94f9 (register esn ok)

@Stateless
public class RegisterEsnService {

	@Inject
	private EsnDao esnDao;

<<<<<<< HEAD
<<<<<<< HEAD
//	@Inject
//	private AddDocumentManagedBean addDocumentManagedBean;

	private static Document document;

	public void register(RegisterEsnViewModel viewModel) {

=======
=======
	@Inject
	private AddDocumentManagedBean addDocumentManagedBean;

	private static Document document;

>>>>>>> 84f94f9 (register esn ok)
	public void register(RegisterEsnViewModel viewModel) {

		AdressDetails adressDetails = new AdressDetails();
		adressDetails.setAdress(viewModel.getAdress());
		adressDetails.setCity(viewModel.getCity());
		adressDetails.setCountry(viewModel.getCountry());
		adressDetails.setPostalCode(viewModel.getPostalCode());

		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setBrand(viewModel.getBrand());
		companyDetails.setEmail(viewModel.getEmail());
		companyDetails.setPassword(viewModel.getPassword());
		companyDetails.setCreationDate(new Date());
		companyDetails.setAdressDetails(adressDetails);

		companyDetails.setDocument(document);

		Esn esn = new Esn();
<<<<<<< HEAD
		
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
=======
>>>>>>> 84f94f9 (register esn ok)

		esn.setCompanyDetails(companyDetails);

		Long id = esnDao.register(esn);

		System.out.println("Esn vient d'etre crée avec :" + id);

	}

	public static void getDoc(Document doc) {
		doc.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
		doc.setDocCreation(new Date());
		document = doc;
<<<<<<< HEAD
=======
>>>>>>> 54dbdcd (user)
=======
>>>>>>> 84f94f9 (register esn ok)
	}
}
