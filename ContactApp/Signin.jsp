<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	String uid = request.getParameter("userid");
	String uname = request.getParameter("userName");
	String upassword = request.getParameter("password");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
	    }	    
	    catch(SQLException e){
	        e.printStackTrace();
	    }
    }
    catch(ClassNotFoundException e){
        e.printStackTrace();
    }
    //try{
    out.println("  "+uid+"  "+uname+"  "+upassword+"  ");
        //PreparedStatement ps = con.prepeareStatement("insert into users(id,name,password) values('"+uid+"','"+uname+"','"+upassword+"')");
        //int row = ps.executeUpdate();   
    //}
    //catch(SQLException e){
      //  e.printStackTrace();
    //}
    
    out.println("Data Added");
	%>
	<br/><br/>
	<a href="Addcontact.html">Add_Contact</a>
</body>
</html>