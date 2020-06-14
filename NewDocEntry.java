package Application;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;


public class NewDocEntry extends JDialog implements ActionListener 
{
	Container cp;
	JComboBox cb1;
	JLabel lb,lb1,lb2,lb3;
	JButton b1,b2;
	MainScreen pref;
	JTextField tfName1,tfName2,tfName3;
	JFileChooser jf;
	
	//JList lstFont,lstFontstyle,lstSize;

	public NewDocEntry(JFrame Owner,String title,boolean modal)	
	{	
		super(Owner,title,modal);
		pref=(MainScreen) Owner;
		cp=getContentPane();
		cp.setLayout(new GridLayout(4,2,20,20));
		
       lb  = new JLabel("Doctor Name");
       cp.add(lb);
       
       tfName1 = new JTextField(25);
       cp.add(tfName1);
       
       lb1  = new JLabel("Speciality");
       cp.add(lb1);
       
	   cb1=new JComboBox();
		
		cb1.addItem("Physician");
		cb1.addItem("Orthologist");
		cb1.addItem("Eye Specialist");
		cb1.addItem("Gynologist");
		cp.add(cb1);
		
		
		lb2  = new JLabel("Contact no.");
	       cp.add(lb2);
	       
	    tfName2 = new JTextField(25);
	    cp.add(tfName2);
	       
		
		
		
		lb3  = new JLabel("Clinic Address");
	       cp.add(lb3);
	       tfName3 = new JTextField(25);
		    cp.add(tfName3);
		       
		
		b1=new JButton("Save");
		
		cp.add(b1);
		b1.addActionListener(this);
		
		
		b2=new JButton("Cancel");
		
		cp.add(b2);
		b2.addActionListener(this);
		
		setSize(475,250);
		setLocation(150,150);
		setVisible(true);
 	}

	public void actionPerformed(ActionEvent ae)	{
		
		if (ae.getSource()==b2)
		{
			this.dispose();

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
				String data2 = tfName3.getText();
				
				dos.writeUTF("I 10 Deep Hospital,pune");
				dos.writeUTF("Doctor Name:");
				dos.writeUTF(data);
				
				dos.writeUTF("Contact number:");
				dos.writeUTF(data1);
				
				dos.writeUTF("Clinic Address:");
				dos.writeUTF(data2);
				
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
