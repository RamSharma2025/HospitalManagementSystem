package Application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class NewPatient extends JDialog implements ActionListener 
{
	Container cp;
	JButton save, reset;
	MainScreen pref;
	
	
	public NewPatient(JFrame Owner,String title,boolean modal)
	{
		super(Owner,title,modal);
		pref=(MainScreen) Owner;
		cp = getContentPane();
		//cp.setLayout(new FlowLayout());
		JTabbedPane tb = new JTabbedPane();
		tb.addTab("Personal Info", new MyPanelPersonalInfo());
		
     //	tb.addTab("Medical History", new MyPanelMedicalHistory());
	
		//tb.addTab("Others", new MyPanelOthers());
		cp.add(tb);
	
		
		save = new JButton("Save");
		save.setLayout(new FlowLayout());
		tb.add(save);
		save.addActionListener(this);
		
		reset = new JButton("Reset");
		reset.setLayout(new FlowLayout());
		tb.add(reset);
		reset.addActionListener(this);
		
		setTitle("New Patient");
		setSize(600,400);
		setVisible(true);
		

	}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	
}
      class MyPanelPersonalInfo extends JPanel
    {
    	 
		
			JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
			JTextField patientcode,firstname,lastname,contactno,address;
			JComboBox cb1 ,cb2, cb3, cb4, cb5, cb6;
			
			public MyPanelPersonalInfo()
			{
				
				
				//Label
				lb1=new JLabel("Patient Code");
				lb1.setBounds(20, 30, 100, 20);
				add(lb1);
				
				//Textbox
				patientcode=new JTextField(25);
				patientcode.setBounds(150, 30, 200, 20);
				add(patientcode);
				
				//Label
				lb2=new JLabel("First Name");
				lb2.setBounds(20, 70, 100, 20);
				add(lb2);
				
				//Textbox
				firstname=new JTextField(25);
				firstname.setBounds(150, 70, 200, 20);
				add(firstname);
				
				//Label
				lb3=new JLabel("Last Name");
				lb3.setBounds(20, 110, 100, 20);
				add(lb3);
				//Textbox
				lastname=new JTextField(25);
				lastname.setBounds(150, 110, 200, 20);
				add(lastname);
				
				 lb4  = new JLabel(" BirthDate");
			       lb4.setBounds(0, 130, 80, 20);
			       add(lb4);
			       
				   cb1=new JComboBox();
					
					for(int i=1;i<31;i++)
					{
					cb1.addItem(i);
					add(cb1);
					}
					cb1.setBounds(100, 130, 80, 20);
					 cb2=new JComboBox();
						
						for(int j=0;j<12;j++)
						{
						cb2.addItem(j);
						add(cb2);
						}
						cb2.setBounds(230, 130, 80, 20);
						 cb3=new JComboBox();
							
							for(int k=1961;k<2018;k++)
							{
							cb3.addItem(k);
							add(cb3);
							}
							cb3.setBounds(330, 130, 80, 20);
				
							
							
							 lb5  = new JLabel(" Admission Date");
						       lb5.setBounds(0, 130, 80, 20);
						       add(lb5);
						       
							   cb4=new JComboBox();
								
								for(int i=1;i<31;i++)
								{
								cb4.addItem(i);
								add(cb4);
								}
								cb4.setBounds(100, 130, 80, 20);
								 cb5=new JComboBox();
									
									for(int j=0;j<12;j++)
									{
									cb5.addItem(j);
									add(cb5);
									}
									cb5.setBounds(230, 130, 80, 20);
									 cb6=new JComboBox();
										
										for(int k=1961;k<2018;k++)
										{
										cb6.addItem(k);
										add(cb6);
										}
										cb3.setBounds(330, 130, 80, 20);
										
							
										//Label
										lb6=new JLabel("Contact Number");
										lb6.setBounds(20, 150, 100, 20);
										add(lb6);
				//Textbox
				contactno=new JTextField(25);
				contactno.setBounds(150, 110, 200, 20);
				add(contactno);
				
				
				//Label
				lb7=new JLabel("Address");
				lb7.setBounds(20, 150, 100, 20);
				add(lb7);
				
				//Textbox
				address=new JTextField(25);
				address.setBounds(150, 150, 200, 20);
				add(address);
			
				//setTitle("Persoal Info");	
				//cp.setBackground(Color.pink);
			//	setSize(700, 700);
				//''setVisible(true);		
				
				//when we close the frame exit the application
			//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//JScrollPane jp = new JScrollPane(cp);
	    		//add(jp,BorderLayout.CENTER);
			}
    }
      class MyPanelMedicalHistory extends JFrame
      {
    	  Container cp1;
  		
			JLabel lb8,lb9,lb10,lb11;
			JTextField bloodgroup,weight,height,surgeries;
		
			
			public MyPanelMedicalHistory()
			{
				cp1=getContentPane();
				cp1.setLayout(null);
				
				//Label
				lb8=new JLabel("Blood Group");
				lb8.setBounds(20, 30, 100, 20);
				cp1.add(lb8);
				
				//Textbox
				bloodgroup=new JTextField(25);
				bloodgroup.setBounds(150, 30, 200, 20);
				cp1.add(bloodgroup);
				
				//Label
				lb9=new JLabel("Weight");
				lb9.setBounds(20, 70, 100, 20);
				cp1.add(lb9);
				
				//Textbox
				weight=new JTextField(25);
				weight.setBounds(150, 70, 200, 20);
				cp1.add(weight);
				
				//Label
				lb10=new JLabel("Height");
				lb10.setBounds(20, 110, 100, 20);
				cp1.add(lb10);
				//Textbox
				height=new JTextField(25);
				height.setBounds(150, 110, 200, 20);
				cp1.add(height);
				
				//Label
				lb11=new JLabel("Surgeries");
				lb11.setBounds(20, 110, 100, 20);
				cp1.add(lb11);
				//Textbox
				surgeries=new JTextField(25);
				surgeries.setBounds(150, 110, 200, 20);
				cp1.add(surgeries);
				
				setTitle("Medical History");	
				cp1.setBackground(Color.pink);
				setSize(700, 700);
				setVisible(true);		
				
				//when we close the frame exit the application
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JScrollPane jp = new JScrollPane(cp1);
	    		add(jp,BorderLayout.CENTER);
			}
      }

   
      class MyPanelOthers extends JFrame
      {
    	  Container cp2;
    		
			JLabel lb12;
			JTextField comment;
		
			
			public MyPanelOthers()
			{
				cp2=getContentPane();
				cp2.setLayout(null);
				
				//Label
				lb12=new JLabel("Comments");
				lb12.setBounds(20, 30, 100, 20);
				cp2.add(lb12);
				
				//Textbox
				comment=new JTextField(25);
				comment.setBounds(150, 30, 200, 20);
				cp2.add(comment);
				
				setTitle("Others");	
				cp2.setBackground(Color.pink);
				setSize(700, 700);
				setVisible(true);		
				
				//when we close the frame exit the application
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		JScrollPane jp = new JScrollPane(cp2);
	    		add(jp,BorderLayout.CENTER);
			}
			
      }
 
   
      
