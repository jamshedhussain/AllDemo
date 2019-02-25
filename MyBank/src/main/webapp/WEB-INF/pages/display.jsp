<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
				<h2><center>MyCustomers</center></h2><hr>
				<table>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Address</th>
						<th>AccountNo</th>
					</tr>
					
						<c:forEach items="${listCust}"  var="listCust">
						<tr>
							<td>${listCust.id}</td>
							<td>${listCust.name}</td>
							<td>${listCust.address}</td>
							<td>${listCust.accountNo}</td>
						</tr>
					</c:forEach>
					
				</table><br><hr>
			<center><a href="showForm.htm">AddNewRecords</a></center>
		
</body>
</html>