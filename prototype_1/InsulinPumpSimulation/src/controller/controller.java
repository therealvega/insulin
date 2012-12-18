package controller;

import java.awt.EventQueue;

import model.Patient;

import view.PumpFrame;

public class controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//*****Patient
		Patient p = new Patient();
		final PumpFrame f = new PumpFrame();
		
		

		//***** GUI *****
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//***************
		
		//***** testThread
		Clock c = new Clock(p, f);

		Thread t1 = new Thread(c);
		t1.start();
		

		
		
	}

}



