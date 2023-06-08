package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import fr.isika.cda.entities.activity.Duty;
import fr.isika.cda.entities.activity.DutyType;
import fr.isika.cda23.project3.presentation.viewModels.CraViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;
import fr.isika.cda23.projet3.repository.Activity.ActivityRepositoryDao;

@ManagedBean
@SessionScoped
public class ManagementCra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6212232480033470023L;

	@Inject
	private ActivityRepositoryDao activityDao;

	private List<Duty> listDuties;

	private CraViewModel cvm = new CraViewModel();

	@PostConstruct
	public void init() {
		listDuties = activityDao.listDuties();
	}

	public void createActivity() throws IOException {

		Duty duty = new Duty();
		duty.setCreateDate(new Date());
		duty.setDescription(cvm.getDescription());
		duty.setEndAt(cvm.getEndAt());
		duty.setTypeOfDuty(cvm.getDutyType());
		duty.setStartAt(cvm.getStartAt());
		activityDao.create(duty);
		cvm = new CraViewModel();
		listDuties = activityDao.listDuties();

		NavigationUtils.redirectToUserList("employeeCraManagement.xhtml");

	}

	public DutyType[] typesOfDuty() {
		return DutyType.values();
	}

	public void listDuties() {
		listDuties = activityDao.listDuties();
	}

	public List<Duty> getListDuties() {
		return listDuties;
	}

	public void setListDuties(List<Duty> listDuties) {
		this.listDuties = listDuties;
	}

	public CraViewModel getCvm() {
		return cvm;
	}

	public void setCvm(CraViewModel cvm) {
		this.cvm = cvm;
	}

	public DutyType[] typesOfDuties() {
		return DutyType.values();

	}
}
