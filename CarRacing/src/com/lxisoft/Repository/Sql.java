package com.lxisoft.Repository;
import com.lxisoft.Racing.*;

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
	public void viewDatabase(ArrayList<Car> cars)
	{
		databaseConnection();
		try
		{
			String sql  = "select * from cars" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			//while(rs.next())
			//for(i=0;i<5;i++)
			//{
				rs.next();

				cars.add(i,new Sportscar());
				cars.get(i).setName(rs.getString("CarName"));
				cars.get(i).setTyre(rs.getString("TyreType"));

				//i++;		
			//}
			stmt.close();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		//return cars;
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