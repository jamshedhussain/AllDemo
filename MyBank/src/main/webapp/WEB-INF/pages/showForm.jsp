<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="showData.htm" method="POST" modelAttribute="e">
	<h2><center>AddNewRecords</center></h2><hr>
	<table>
		<tr>
		<td>Id::</td>
		<td><form:input path="id"/></td>
		</tr>
	
		<tr>
		<td>Name::</td>
		<td><form:input path="name"/></td>
		</tr>
		
		<tr>
		<td>Address::</td>
		<td><form:input path="address"/></td>
		</tr>
		
		<tr>
		<td>AccountNo::</td>
		<td><form:input path="accountNo"/></td>
		</tr>
		
		<tr>
		<td><button type="reset" onclick="reset">Reset</button></td>
		<td><input type="submit" value="Submit"/></td>
		</tr>
	</table>
	</form:form>
	
	
	<h1>${sMsg }<br></h1>
	
	<table>
		<tr>
			<th style="border:1px solid black">Id</th>
			<th style="border:1px solid black">Name</th>
			<th style="border:1px solid black">Address</th>
			<th style="border:1px solid black">AccountNo</th>
		</tr>
		<tr>
			<td style="border:1px solid black">${e.id }</td>
			<td style="border:1px solid black">${e.name }</td>
			<td style="border:1px solid black">${e.address }</td>
			<td style="border:1px solid black">${e.accountNo }</td>
		</tr>
	</table>
	<hr><center><a href="display.htm">MyCustomer</a></center>
					

</body>
</html>