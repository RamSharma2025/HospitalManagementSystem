package Application;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

	

	public class TableInfo extends JDialog
	{
			JTable tb;
			Container cp;
			int row=0,col=0;
			String [] columnNames={ "Roll No." ,"Name" ,"Percentage"};
			TableInfo(SearchPatient owner,String mess,boolean b )
			{
				super(owner,mess,b);
				cp=getContentPane();
				tb=new JTable(10,3);
				JScrollPane jp=new JScrollPane(tb);
				cp.add(jp,BorderLayout.CENTER);
				
				try {
					//int eid=Integer.parseInt(tfmyemployeeId.getText());
					Class.forName("oracle.jdbc.driver.OracleDriver");	
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Oracle-Server:1521:oracle11g", "java","java");
					String query="select * from stu_himanshu ";
			    	PreparedStatement st=con.prepareStatement(query);	    	
			    	ResultSet rs=st.executeQuery();
			    	while(rs.next())
			    	{
			    		tb.setValueAt(rs.getInt(1), row,col++);
			    		tb.setValueAt(rs.getString(2), row,col++);
			    		tb.setValueAt(rs.getFloat(3), row,col++);
			    		row++;
			    		col=0;
			    	}
			    	st.close();
					con.close();	
			    	
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				setSize(500,400);
				setVisible(true);
			}
			
		}






