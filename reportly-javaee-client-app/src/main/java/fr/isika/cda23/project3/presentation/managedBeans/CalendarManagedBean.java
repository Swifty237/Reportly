package fr.isika.cda23.project3.presentation.managedBeans;


import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalendarManagedBean {
	
    private Calendar calendar = Calendar.getInstance();
    private List<Date> listDaysOfCurrentMonth;
    
    @PostConstruct
    public void init() {
    	
    }

}