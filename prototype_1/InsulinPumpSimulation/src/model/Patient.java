package model;

import java.util.Observable;
import java.util.Observer;

public class Patient extends Observable implements Observer{
	
	/**
	 * value for storing the actual Blood glucose level
	 */
	private int bloodGlucoseLevel;
		
	/**
	 * Constructor
	 */
	public Patient(){
		bloodGlucoseLevel = 111;
	}
	
	/**
	 * getter for bloodGlucoseLevel
	 */
	public int getBloodGlucoseLevel(){
		return bloodGlucoseLevel;
	}
	
	/**
	 * setter for bloodGlucoseLevel
	 */
	public void setBloodGlucoseLevel(int value){
		bloodGlucoseLevel=value;
	}
	
	/**
	 * Update Function which is called by the Clock
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		
		this.setBloodGlucoseLevel( this.getBloodGlucoseLevel() + 1 );

		
      	this.setChanged();
      	this.notifyObservers();
      	this.clearChanged();
		
	}
	
			

}
