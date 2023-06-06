package fr.isika.cda23.project3.dataInit;

import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Calendar calendrier = Calendar.getInstance();
        
//        int jourEnCours = calendrier.get(Calendar.DAY_OF_MONTH);
//        int moisEnCours = calendrier.get(Calendar.MONTH) + 1;
//        
//        System.out.println("Jour en cours : " + jourEnCours);
//        System.out.println("Mois en cours : " + moisEnCours);
        
        int moisEnCours = calendrier.get(Calendar.MONTH) + 1;
        int anneeEnCours = calendrier.get(Calendar.YEAR);
        
        calendrier.set(Calendar.DAY_OF_MONTH, 1);
        int nombreDeJours = calendrier.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        for (int jour = 1; jour <= nombreDeJours; jour++) {
            System.out.println(jour);
        }
        
	}

}
