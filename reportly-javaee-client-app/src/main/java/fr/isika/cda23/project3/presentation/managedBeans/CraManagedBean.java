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

@ManagedBean
@ViewScoped
public class CraManagedBean implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 6436832047055687440L;

	private String currentMonthYear;
	private List<LocalDate> dates; // Liste des dates du mois
	private List<Boolean> selectedDates; // Liste des valeurs sélectionnées

	@PostConstruct
	public void init() {
		dates = getDatesOfMonth();
		currentMonthYear = getCurrent();
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

	public List<Boolean> getSelectedDates() {
		return selectedDates;
	}

	public void setSelectedDates(List<Boolean> selectedDates) {
		this.selectedDates = selectedDates;
	}

}