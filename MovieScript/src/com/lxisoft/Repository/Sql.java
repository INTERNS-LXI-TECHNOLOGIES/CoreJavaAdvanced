package com.lxisoft.Repository;
import com.lxisoft.Racing.*;
import java.util.Scanner;

import java.sql.*;
import java.util.Collections;
import java.util.ArrayList;


public class Sql 
{
	
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;
	int row;
			ArrayList<Car> cars=new ArrayList<Car>();

	public void databaseConnection() 
	{

	
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
			try{
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars?useSSL=false&serverTimezone=Asia/Shanghai","root","Karthik1996$");

			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public void addToDatabase(Car cars)
	{
		databaseConnection();
		try
		{

			ps = con.prepareStatement("insert into cars(CarName,TyreType) values('"+cars.getName()+"','"+cars.getTyre()+"')");
			row = ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void update()
	{
				databaseConnection();
				try
				{
					Scanner scn=new Scanner(System.in);
					System.out.println("Enter your query");
					String qry= scn.nextLine();	
								stmt = con.createStatement();
								boolean flag=stmt.execute(qry);
								if (flag==true)
								{
												rs = stmt.getResultSet();
												while(rs.next())
												{
													System.out.println(rs.getString(1)+rs.getString(2));
												}
												rs.close();

								}
								else
								{
									int rowcount=stmt.getUpdateCount();
									System.out.println("The number of record that affected"+rowcount);
								}
							}
								catch(SQLException e)
		{
			System.out.println(e);
		}

				

	}
	public void deletRecord(int deleteId)
	{
		databaseConnection();
		try
		{
			String sql = "delete from cars where id ='"+deleteId+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}