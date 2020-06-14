package Application;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewAppointment extends JDialog implements ActionListener
{
	Container cp;
	JComboBox cb1 ,cb2, cb3;
	JLabel lb,lb1,lb2,lb3;
	JButton b1,b2,b3;
	MainScreen pref;
	JTextField tfName1,tfName2,tfName3;
	JFileChooser jf;
	
	
	//JList lstFont,lstFontstyle,lstSize;

	public NewAppointment(JFrame Owner,String title,boolean modal)	
	{	
		super(Owner,title,modal);
		pref=(MainScreen) Owner;
		cp=getContentPane();
		cp.setLayout(null);
		
       lb  = new JLabel("Patient Name");
       lb.setBounds(0, 100, 80, 20);
       cp.add(lb);
       
       tfName1 = new JTextField(25);
       tfName1.setBounds(100, 100, 80, 20);
       cp.add(tfName1);
       
       lb1  = new JLabel("Date");
       lb1.setBounds(0, 130, 80, 20);
       cp.add(lb1);
       
	   cb1=new JComboBox();
		
		for(int i=1;i<31;i++)
		{
		cb1.addItem(i);
		cp.add(cb1);
		}
		cb1.setBounds(100, 130, 80, 20);
		 cb2=new JComboBox();
			
			for(int j=1;j<12;j++)
			{
			cb2.addItem(j);
			cp.add(cb2);
			}
			cb2.setBounds(230, 130, 80, 20);
			 cb3=new JComboBox();
				
				for(int k=1996;k<2017;k++)
				{
				cb3.addItem(k);
				cp.add(cb3);
				}
				cb3.setBounds(330, 130, 80, 20);
		
		lb2  = new JLabel("Time");
				lb2.setBounds(0, 160, 80, 20);
	       cp.add(lb2);
	       
	    tfName2 = new JTextField(25);
	    tfName2.setBounds(100, 160, 80, 20);
	    cp.add(tfName2);
	       
		
		
		
		
		       
		
		b1=new JButton("Save");
		
		cp.add(b1);
		b1.setBounds(50, 240, 80, 20);
		b1.addActionListener(this);
		
		
		b2=new JButton("Reset");
		b2.setBounds(150, 240, 80, 20);
		cp.add(b2);
		b2.addActionListener(this);
		
       
		
		setSize(475,250);
		setLocation(150,150);
		setVisible(true);
 	}

	public void actionPerformed(ActionEvent ae)	{
		
		if (ae.getSource()==b2)
		{
	     tfName1.setText("");
	     tfName2.setText("");
	     

		}
		if (ae.getSource()==b1)
		{
			jf = new JFileChooser();
			jf.showSaveDialog(null);
			File f = jf.getSelectedFile();
			int ch=0;
			try
			{
				FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);
				
				String data = tfName1.getText();
				String data1 = tfName2.getText();
				
				
				dos.writeUTF("New Appointment");
				dos.writeUTF("Patient Name:");
				dos.writeUTF(data);
				
				dos.writeUTF("Time:");
				dos.writeUTF(data1);
				
				
				
				dos.close();
				fos.close();
		
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
				
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
			
			
		}
	}

}
