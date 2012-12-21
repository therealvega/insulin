package controller;

import java.awt.EventQueue;

import model.Patient;

import view.PumpFrame;

public class controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/**
		 * References to Application Objects
		 */
		Clock myClock = new Clock();
		
		Patient myPatient = new Patient();
		
		final PumpFrame myPumpFrame = new PumpFrame();
		
		

		/**
		 * JFrame for displaying the insulin pump
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myPumpFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
		/**
		 * Managing the Observations
		 */
		myClock.addObserver(myPatient);
		
		myPatient.addObserver(myPumpFrame);
		
		myPumpFrame.setObservedPatient(myPatient);
		
		
		
		/**
		 * Main Thread
		 */
		Thread t1 = new Thread(myClock);
		t1.start();
		
	}

}



