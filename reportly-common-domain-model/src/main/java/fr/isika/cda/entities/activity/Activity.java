package fr.isika.cda.entities.activity;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Activity implements Serializable{
	
	
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = -8098047044102899069L;

@Id
@GeneratedValue
	protected Long id ; 
	
@Temporal(TemporalType.DATE)
    protected Date StartAt ;


@Temporal(TemporalType.DATE)
    protected Date EndAt; 

   

    protected int Overtime ;
   


protected String Description ;  

protected Date CreateDate; 

protected Boolean OnCall ; 




  
    

     
     
    
		
	}


