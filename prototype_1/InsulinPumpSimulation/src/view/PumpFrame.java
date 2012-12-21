package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import model.Patient;

public class PumpFrame extends JFrame implements Observer {

	/**
	 * GUI Elements
	 */
	private static final long serialVersionUID = -6871016683348174085L;
	private JPanel contentPane;
	private JTextField txtBloodGlucoseLevel;
	private JTextField txtTime;
	
	/**
	 * Data Elements
	 */
	private Patient observedPatient;

	/**
	 * setter for observed Patient
	 */
	public void setObservedPatient(Patient p){
		this.observedPatient = p;
	}

	/**
	 * Create the frame.
	 */
	public PumpFrame() {
		setResizable(false);
		setTitle("InsulinPump");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTxtBloodGlucoseLevel(new JTextField());
		getTxtBloodGlucoseLevel().setEditable(false);
		getTxtBloodGlucoseLevel().setBounds(130, 94, 86, 20);
		contentPane.add(getTxtBloodGlucoseLevel());
		getTxtBloodGlucoseLevel().setColumns(10);
		
		
		JLabel lblBloodGlucoseLevel = new JLabel("Blood glucose level");
		lblBloodGlucoseLevel.setBounds(10, 97, 123, 14);
		contentPane.add(lblBloodGlucoseLevel);
		
		txtTime = new JTextField();
		txtTime.setEditable(false);
		txtTime.setBounds(10, 39, 424, 20);
		contentPane.add(txtTime);
		txtTime.setColumns(10);
	}


	/**
	 * getTxtBloodGlucoseLevel
	 */
	public JTextField getTxtBloodGlucoseLevel() {
		return txtBloodGlucoseLevel;
	}

	/**
	 * setTxtBloodGlucoseLevel
	 */
	public void setTxtBloodGlucoseLevel(JTextField jTextField) {
		this.txtBloodGlucoseLevel = jTextField;
	}

	/**
	 * setTxtBloodGlucoseLevel
	 */
	public void setTxtBloodGlucoseLevel(String string) {
		this.txtBloodGlucoseLevel.setText(string);
	}
	
	/**
	 * setTxtTime
	 */	
	public void setTxtTime(String string) {
		this.txtTime.setText(string);
	}



	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		this.setTxtBloodGlucoseLevel(Integer.toString(this.observedPatient.getBloodGlucoseLevel() ) );
	}

}
