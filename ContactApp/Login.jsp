<!DOCTYPE html>
<html>
<head>
	<title>Log in</title>
</head>
<body>
	<h1>Welcome</h1>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	String uname = request.getParameter("userName");
	String upassword = request.getParameter("password");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
           //out.println("  "+uid+"  "+uname+"  "+upassword+"  ");
           PreparedStatement ps = con.prepareStatement("insert into users(name,password) values('"+uname+"','"+upassword+"')");
           int row = ps.executeUpdate();   
	    }	    
	    catch(SQLException e){
	        e.printStackTrace();
	    }
    }
    catch(ClassNotFoundException e){
        e.printStackTrace();
    }
	%>
	<br/><br/>
	<a href="Addcontact.html">Add_Contact</a>
	<br/>
	<a href="index.html">Log_out</a>
</body>
</html>