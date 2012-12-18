package controller;

import model.Patient;
import view.PumpFrame;

public class Clock implements Runnable{
	
	//Reference to the virtual patient object
	private Patient pPatient;
	
	//Reference to the virtual insulin pump display
	private PumpFrame pPumpFrame;
	
	//Constructor
	Clock(Patient pat, PumpFrame pum){
		this.pPatient=pat;
		this.pPumpFrame=pum;
		
	}
	


	
		
	  @Override public void run()
	  {	
		  try 	{
				    for ( int i = 0; i < 100; i++ ){
				      System.out.println( "Pulse" );
				      	//Send Pulse to Virtual Patient
				      	this.pPatient.recievePulse();
				      	
				      	this.pPumpFrame.setTxtBloodGlucoseLevel(Integer.toString(this.pPatient.getBloodGlucoseLevel()));
						Thread.sleep(200);
				    }
		  		} catch (InterruptedException e) 
		  		{
					// TODO Auto-generated catch block
					e.printStackTrace();
		  		}

	    
	  }
}
