package Application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.directory.SearchResult;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;




public class MainScreen extends JFrame implements ActionListener
{
		
			Container cp;
			JMenuBar mbar;
			JMenu Patient,Doctor,Reports,Help;
			JMenuItem NewAdmission,Search,NewAppointment,Exit,NewDoctor,SearchDoctor,Bill,ViewAppointment,Aboutus;
			JTextArea ta;
			NewDocEntry dlg;
			Bill dlg1;
			NewPatient dlg2;
			NewAppointment dlg3;
			SearchPatient dlg4;
			public MainScreen(String title)
			{
				super(title);
				cp = getContentPane();
				mbar = new JMenuBar();
				setJMenuBar(mbar);
				Patient = new JMenu("Patient");
				mbar.add(Patient);
				
				ta = new JTextArea();
				cp.add(ta);
				
				NewAdmission = new JMenuItem("New Admission");
				Patient.add(NewAdmission);
				NewAdmission.addActionListener(this);
				
				Search = new JMenuItem("Search");
				Patient.add(Search);
				Search.addActionListener(this);
				
				NewAppointment = new JMenuItem("New Appointment");
				Patient.add(NewAppointment);
				NewAppointment.addActionListener(this);
				
				Exit = new JMenuItem("Exit");
				Patient.add(Exit);
				Exit.addActionListener(this);
				
				
				Doctor = new JMenu("Doctor");
				mbar.add(Doctor);
				
				NewDoctor = new JMenuItem("New Doctor");
				Doctor.add(NewDoctor);
				NewDoctor.addActionListener(this);
				
				SearchDoctor = new JMenuItem("Search Doctor");
				Doctor.add(SearchDoctor);
				SearchDoctor.addActionListener(this);
				
				
				
				Reports = new JMenu("Reports");
				mbar.add(Reports);
				
				Bill = new JMenuItem("Bill");
				Reports.add(Bill);
				Bill.addActionListener(this);
				
				ViewAppointment = new JMenuItem("View Appointment");
				Reports.add(ViewAppointment);
				ViewAppointment.addActionListener(this);
				
				
				
				
				Help = new JMenu("Help");
				mbar.add(Help);
				
				Aboutus = new JMenuItem("Aboutus");
				Help.add(Aboutus);
				Aboutus.addActionListener(this);
				
				setSize(500,500);
				setVisible(true);
			}

			@Override
			public void actionPerformed(ActionEvent arg) 
			{
				// TODO Auto-generated method stub
			
				if(arg.getSource()==NewDoctor)
				{
					dlg = new NewDocEntry(this,"New Doctor Entry",true);
				}
				
				if(arg.getSource()==Bill)
				{
					dlg1 = new Bill(this,"Bill",true);
				}
				if(arg.getSource()==Aboutus)
				{
					JOptionPane.showMessageDialog(this, "This app is created by RAMRATAN SHARMA");
					
					
				}
				if(arg.getSource()==NewAdmission)
				{
					dlg2 = new NewPatient(this,"NewPatient",true);
				}
				if(arg.getSource()==NewAppointment)
				{
					dlg3 = new NewAppointment(this,"NewsAppointment",true);
				}
				//if(arg.getSource()==Search)
				//{
					//dlg4 = new SearchResult(this,"Search Patient",true);
				//}
			}
				
				

				/*if(arg.getSource()==Open)
				{
					JFileChooser jfr = new JFileChooser();
					jfr.showOpenDialog(this);
				}
				if(arg.getSource()==Save)
				{
					JFileChooser jfr = new JFileChooser();
					jfr.showSaveDialog(this);
				}
				if(arg.getSource()==Exit)
				{
					int x = JOptionPane.showConfirmDialog(this, "Exit");
					if(x==0)
						this.dispose();
				}
				if(arg.getSource()==Cut)
				{
					ta.cut();
					
				}
				if(arg.getSource()==Copy)
				{
					ta.copy();
					
				}
				if(arg.getSource()==Paste)
				{
					ta.paste();
					
				}
				if(arg.getSource()==Bkcolor)
				{
					Color c = JColorChooser.showDialog(this, "This is my color Dialog box", null);
					ta.setBackground(c);
					
				}
				if(arg.getSource()==Fkcolor)
				{
					Color c = JColorChooser.showDialog(this, "This is my color Dialog box", null);
					ta.setForeground(c);
					
				}
				if(arg.getSource()==font)
				{
				//	dlg = new MyDialogbox(this,"My Dialog Box",true);
				}
				
				
			}*/
				public static void main (String[] args)
				{
					MainScreen m = new MainScreen("Patient Information System");
				}

				
		}

			







