<%@import src.com.Lxisoft.ContactAppController %>
<%@import java.util.*;%>
<!DOCTYPE html>
<html>
<head>
<title>
	Contact APP  
</title>
</head>

<body>
	<%
	ArrayList<Contact> contact=New ArrayList<Contact>();
		%>
	<h1 align = center ahref=#><b><u> Contact APP </u></b></h1>
	<p align = center>A small contact app developed by Faris for LxiTechnologies pvt.ltd</p>
	<h2 aligN = center> Contact Form </h2>
	<form action = "ContactAppController" method="post">
		<table align=center style ="width: 50%">
			<tr>
    			<td>First Name</td>
    			<td><input type="text" name="first_name" />
    				<%
    				contact.get(0).setFirstName();
    				%></td>
    		</tr>
    		<tr>
    					<td>Last Name</td>
    					<td><input type="text" name="last_name" />
    					<%
    				contact.get(0).setLastName();
    				%>
    			</td>
    				</tr>
    				<tr>
    					<td>UserName</td>
    					<td><input type="text" name="Email" />
    						<%
    							contact.get(0).setEmail();
    						%>
    					</td>
    				</tr>
    				
    				
    				<tr>
    					<td>Contact No</td>
    					<td><input type="text" name="contact" /></td>
    				</tr></table>
    			<input align = "center" type="submit" value="Submit" />

    		</form>
</body>
</html>


