package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PumpFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6871016683348174085L;
	private JPanel contentPane;
	private JTextField txtBloodGlucoseLevel;



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
	}



	public JTextField getTxtBloodGlucoseLevel() {
		return txtBloodGlucoseLevel;
	}



	public void setTxtBloodGlucoseLevel(JTextField jTextField) {
		this.txtBloodGlucoseLevel = jTextField;
	}



	public void setTxtBloodGlucoseLevel(String string) {
		this.txtBloodGlucoseLevel.setText(string);
		
	}
	
	
}
