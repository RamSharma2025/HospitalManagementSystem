package Application;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class SearchPatient extends JFrame implements ActionListener



	{

			//@SuppressWarnings({ "rawtypes", "unchecked", "serial" })
			
				Container cp;
				JButton	search;
				JLabel lbName;
				JTextField tfName1;
				TableInfo t;
				
			
				
				
				public SearchPatient ()
				{
					cp=getContentPane();
					cp.setLayout(null);
					
					//Label
					lbName=new JLabel("Patient Name");
					lbName.setBounds(20, 30, 100, 20);
					cp.add(lbName);
					
					//Textbox
					tfName1=new JTextField(25);
					tfName1.setBounds(150, 30, 200, 20);
					cp.add(tfName1);
					
					//Button
					search=new JButton("Search");		
					search.setBounds(20, 250, 100, 20);
					cp.add(search);
					search.addActionListener(this);
					
					setTitle("Search Patient");
					setSize(400,300);
					setVisible(true);	
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}





				@Override
				public void actionPerformed(ActionEvent arg) {
					// TODO Auto-generated method stub
					if(arg.getSource()==search)
					{
						t = new TableInfo(this,"Search Patient",true);
					}
				}
}
