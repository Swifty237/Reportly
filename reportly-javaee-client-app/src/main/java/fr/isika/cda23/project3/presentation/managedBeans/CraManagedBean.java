package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.isika.cda.entities.activity.DutyType;
import fr.isika.cda.entities.activity.TrainingType;
import fr.isika.cda23.project3.presentation.viewModels.ActivityViewModel;

@ManagedBean
@ViewScoped
public class CraManagedBean implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 6436832047055687440L;

	private String currentMonthYear;
	private List<LocalDate> dates; // Liste des dates du mois
	private List<LocalDate> selectedDates; // Liste des valeurs sélectionnées
	private List<String> allTypesOfActivities;
	private List<Integer> numbers;
	private boolean checkboxSelected;
	
	private ActivityViewModel activityVm = new ActivityViewModel();

	@PostConstruct
	public void init() {
		dates = getDatesOfMonth();
		currentMonthYear = getCurrent();
		numbers = addNumbers();
	}
	
	 public static List<Integer>  addNumbers() {
	        ArrayList<Integer> myList = new ArrayList<>();
	        
	        for (int i = 1; i <= 7; i++) {
	            myList.add(i);
	        }
	        
	        return myList;
	    }
	
	public static List<String> addAllTypes() {
		
		List<String> listTypes = new ArrayList<String>();
		
		for(DutyType dutyType : typesOfDuties()) {
			listTypes.add(dutyType.toString());
		}
		
		for(TrainingType trainingType : typesOfTraning()) {
			listTypes.add(trainingType.toString());
		}
		
		listTypes.add("Autres activités");
		
		return listTypes;
	}
	
	public static DutyType[] typesOfDuties() {
		return DutyType.values();
	}
	
	public static TrainingType[] typesOfTraning() {
		return TrainingType.values();
	}
	
	public int findPosition(LocalDate date) {
		return dates.indexOf(date);
	}
	
	public static String getCurrent() {
		LocalDate current = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        String formattedDate = current.format(formatter);
        return formattedDate;
	}

	public static List<LocalDate> getDatesOfMonth() {
		List<LocalDate> listDate = new ArrayList<>();
		YearMonth yearMonth = YearMonth.now();
		int daysInMonth = yearMonth.lengthOfMonth();

		for (int day = 1; day <= daysInMonth; day++) {
			LocalDate date = yearMonth.atDay(day);
			listDate.add(date);
		}
		return listDate;
	}

	public static String getDayOfWeek(LocalDate date) {
		DayOfWeek dayOfWeek = date.getDayOfWeek();

		switch (dayOfWeek) {
		
		case MONDAY:
			return "Lundi";

		case TUESDAY:
			return "Mardi";

		case WEDNESDAY:
			return "Mercredi";

		case THURSDAY:
			return "Jeudi";

		case FRIDAY:
			return "Vendredi";

		case SATURDAY:
			return "Samedi";

		case SUNDAY:
			return "Dimanche";

		default:
			return "Jour invalide";
		}

	}

	public List<String> getAllTypesOfActivities() {
		return allTypesOfActivities;
	}

	public void setAllTypesOfActivities(List<String> allTypesOfActivities) {
		this.allTypesOfActivities = allTypesOfActivities;
	}

	public String getCurrentMonthYear() {
		return currentMonthYear;
	}

	public void setCurrentMonthYear(String currentMonthYear) {
		this.currentMonthYear = currentMonthYear;
	}

	public List<LocalDate> getDates() {
		return dates;
	}

	public void setDates(List<LocalDate> dates) {
		this.dates = dates;
	}

	public List<LocalDate> getSelectedDates() {
		return selectedDates;
	}

	public void setSelectedDates(List<LocalDate> selectedDates) {
		this.selectedDates = selectedDates;
	}

	public ActivityViewModel getActivityVm() {
		return activityVm;
	}

	public void setActivityVm(ActivityViewModel activityVm) {
		this.activityVm = activityVm;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public boolean isCheckboxSelected() {
		return checkboxSelected;
	}

	public void setCheckboxSelected(boolean checkboxSelected) {
		this.checkboxSelected = checkboxSelected;
	}
	
}