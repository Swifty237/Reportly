package fr.isika.cda23.project3.business;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Date;

=======
>>>>>>> 54dbdcd (user)
=======
import java.util.Date;

>>>>>>> 84f94f9 (register esn ok)
=======
>>>>>>> 3d333c7 (user)
=======
import java.util.Date;

>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> b7c6b2a (user)
import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.AdressDetails;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda.entities.esn.Esn;
<<<<<<< HEAD
//import fr.isika.cda23.project3.presentation.managedBeans.AddDocumentManagedBean;
=======
>>>>>>> e2bb782 (Refactoring)
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
=======
=======
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
>>>>>>> ab3abe1 (register esn ok)
import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda23.project3.presentation.managedBeans.AddDocumentManagedBean;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
<<<<<<< HEAD
import fr.isika.cda23.project3.repository.EsnDao;
import fr.isika.cda23.project3.repository.user.UserDao;
>>>>>>> 3d333c7 (user)
=======
import fr.isika.cda23.project3.repository.company.EsnDao;
>>>>>>> ab3abe1 (register esn ok)
=======
import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
import fr.isika.cda23.project3.repository.EsnDao;
import fr.isika.cda23.project3.repository.user.UserDao;
>>>>>>> b7c6b2a (user)

@Stateless
public class RegisterEsnService {

	@Inject
	private EsnDao esnDao;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//	@Inject
//	private AddDocumentManagedBean addDocumentManagedBean;
=======
	@Inject
	private AddDocumentManagedBean addDocumentManagedBean;
>>>>>>> ab3abe1 (register esn ok)

	private static Document document;

	public void register(RegisterEsnViewModel viewModel) {
<<<<<<< HEAD
<<<<<<< HEAD

=======
=======
	@Inject
	private AddDocumentManagedBean addDocumentManagedBean;
=======
//	@Inject
//	private AddDocumentManagedBean addDocumentManagedBean;
>>>>>>> e2bb782 (Refactoring)

	private static Document document;

>>>>>>> 84f94f9 (register esn ok)
	public void register(RegisterEsnViewModel viewModel) {
=======
>>>>>>> ab3abe1 (register esn ok)

=======
	public void register(RegisterEsnViewModel viewModel) {
		Esn esn = new Esn();
		
<<<<<<< HEAD
>>>>>>> b7c6b2a (user)
		AdressDetails adressDetails = new AdressDetails();
		adressDetails.setAdress(viewModel.getAdress());
		adressDetails.setCity(viewModel.getCity());
		adressDetails.setCountry(viewModel.getCountry());
		adressDetails.setPostalCode(viewModel.getPostalCode());
<<<<<<< HEAD
<<<<<<< HEAD
=======
		Esn esn = new Esn();
		
=======
>>>>>>> aa13acd (subscription company)
//		AdressDetails adressDetails = new AdressDetails();
//		adressDetails.setAdress(viewModel.getAdress());
//		adressDetails.setCity(viewModel.getCity());
//		adressDetails.setCountry(viewModel.getCountry());
//		adressDetails.setPostalCode(viewModel.getPostalCode());
//		
//		CompanyDetails
<<<<<<< HEAD
>>>>>>> d3087e5 (subscription company)

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
=======
	public void register(RegisterEsnViewModel viewModel) {
		Esn esn = new Esn();
		
>>>>>>> 3d333c7 (user)
		AdressDetails adressDetails = new AdressDetails();
		adressDetails.setAdress(viewModel.getAdress());
		adressDetails.setCity(viewModel.getCity());
		adressDetails.setCountry(viewModel.getCountry());
		adressDetails.setPostalCode(viewModel.getPostalCode());
<<<<<<< HEAD
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
=======

		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setBrand(viewModel.getBrand());
		companyDetails.setEmail(viewModel.getEmail());
		companyDetails.setPassword(viewModel.getPassword());
		companyDetails.setCreationDate(new Date());
		companyDetails.setAdressDetails(adressDetails);

		companyDetails.setDocument(document);

		Esn esn = new Esn();
>>>>>>> ab3abe1 (register esn ok)

		esn.setCompanyDetails(companyDetails);

		Long id = esnDao.register(esn);

		System.out.println("Esn vient d'etre crée avec :" + id);
=======
>>>>>>> aa13acd (subscription company)

	}

	public static void getDoc(Document doc) {
		doc.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
		doc.setDocCreation(new Date());
		document = doc;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 54dbdcd (user)
=======
>>>>>>> 84f94f9 (register esn ok)
=======

>>>>>>> 3d333c7 (user)
=======
>>>>>>> ab3abe1 (register esn ok)
=======

>>>>>>> b7c6b2a (user)
	}
}
