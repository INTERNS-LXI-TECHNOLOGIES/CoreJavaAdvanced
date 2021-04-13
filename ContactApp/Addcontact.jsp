<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	String cname = request.getParameter("contactName");
	String num = request.getParameter("number");
	String mail = request.getParameter("mailid");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        PreparedStatement ps = con.prepeareStatement("insert into contacts(name,number,email) values('"+cname+"','"+num+"','"+mail+"')");
        int row = ps.executeUpdate();
        
        out.println("Contact addded");	    
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    %>
    <br/><br/>
    <a href="Addcontact.html">Add_contact</a>
</body>
</html>