package model;

public class Patient {
	private int bloodGlucoseLevel;
		
	public Patient(){
		bloodGlucoseLevel = 111;
	}
	
	//returns the bloodGlucoseLevel as Integer
	public int getBloodGlucoseLevel(){
		return bloodGlucoseLevel;
	}
	
	public void setBloodGlucoseLevel(int x){
		bloodGlucoseLevel=x;
	}
	
	//Receive Pulse from Clock object
	public void recievePulse(){
		this.update();
	}
	
	// Operations that are caused by pulse
	public void update(){
		this.setBloodGlucoseLevel( this.getBloodGlucoseLevel() + 1 );
	}
	
			

}
