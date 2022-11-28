package emailApp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppUI {
	
	public AppUI() {
		JFrame jf = new JFrame("Email generator");
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel jp1 = new JPanel();
		jp1.setVisible(true);
		jp1.setBackground(Color.blue);
		jp1.setLayout(null);
		jp1.setBounds(100,0, 500,600);
		jf.add(jp1);
		
		JTextField textFieldName = new JTextField("");
		textFieldName.setBounds(200, 50, 100, 40);
		textFieldName.setVisible(true);
		textFieldName.setBackground(Color.white);
		jp1.add(textFieldName);
		
		JTextField textFieldLastName = new JTextField("");
		textFieldLastName.setBounds(200, 150, 100, 40);
		textFieldLastName.setVisible(true);
		textFieldLastName.setBackground(Color.white);
		jp1.add(textFieldLastName);
		
		JLabel labelName = new JLabel("Name");
		labelName.setBounds(20,50,100,40);
		labelName.setVisible(true);
		labelName.setForeground(Color.black);
		labelName.setBackground(Color.white);
		jp1.add(labelName);
		
		JLabel labelLastName = new JLabel("Last Name");
		labelLastName.setBounds(20,150,100,40);
		labelLastName.setVisible(true);
		labelLastName.setBackground(Color.white);
		labelLastName.setForeground(Color.black);
		jp1.add(labelLastName);
		
		JLabel labelDept = new JLabel("Department");
		labelDept.setBounds(20,250,100,40);
		labelDept.setVisible(true);
		labelDept.setBackground(Color.white);
		labelDept.setForeground(Color.black);
		jp1.add(labelDept);
		
		String[] deptChoice = {"Sales", "Accounting", "Developement", "None"};
		final JComboBox<String> cb = new JComboBox<>(deptChoice);
		cb.setBounds(200, 250, 100, 50);
		cb.setVisible(true);
		cb.setBackground(Color.cyan);
		jp1.add(cb);
		
		JButton buttonLogin = new JButton("LOGIN");
		buttonLogin.setBounds(150, 400, 100, 40);
		jp1.add(buttonLogin);
		
		buttonLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Email em = new Email(textFieldName.getText(),textFieldLastName.getText() );
				
			}
		});
		
		while (true) {
		if(!textFieldLastName.getText().isEmpty() && !textFieldName.getText().isEmpty()) {
			buttonLogin.setVisible(true);			
			}
		else {
			buttonLogin.setVisible(false);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
