package controller;

import java.util.Calendar;
import java.util.Date;
import java.util.Observable;

/**
 * This class provides a periodical 
 * pulse, which forces the observing
 * objects to update their status.
 */
public class Clock extends Observable implements Runnable{
		
	/**
	 * This Calendar Object is used to simulate
	 * the time of the application.
	 */
	Calendar cal = Calendar.getInstance();
	
	/**
	 * This Date Object is used to simulate
	 * the time of the application.
	 */
	Date date = new Date();
	
	/**
	 * This variable stores the time in minutes
	 * which shall decay by each pulse
	 */
	private int pulseLength = 5;
	
	
	/**
	 * This is the constructor.
	 */
	Clock(){
		
		/**
		 * initializing calendar and date
		 */
		cal.set(Calendar.HOUR_OF_DAY,0);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);

		date = cal.getTime();
		
	}
	
	/**
	 * @return the time of the calendar object
	 */
	long getTime(){
		return date.getTime();
		
	      //SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd MM YYYY");	
		    //StringBuilder t = new StringBuilder(sdf.format( d ));

			//this.pPumpFrame.setTxtTime(t.toString());
	}
	
	/**
	 * @return the pulseLength
	 */
	public int getPulseLength() {
		return pulseLength;
	}
	
	
	/**
	 * @set the pulseLength
	 */
	public void setPulseLength(int value) {
		pulseLength = value;
	}
	



	
		
	  @Override public void run()
	  {	
		  try 	{

			  	for ( int i = 0; i < 20; i++ ){
				      System.out.println( this.countObservers() );
				      	
				      	date.setTime(date.getTime() + this.pulseLength * 1000);
				      	
				      	this.setChanged();
				      	this.notifyObservers();
				      	this.clearChanged();
				      	
						Thread.sleep(500);
						
				    }
		  		} catch (InterruptedException e) 
		  		{
					// TODO Auto-generated catch block
					e.printStackTrace();
		  		}

	    
	  }


}
