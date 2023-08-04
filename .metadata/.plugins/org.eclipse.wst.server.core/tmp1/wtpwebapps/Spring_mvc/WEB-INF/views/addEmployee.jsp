<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  	<form action="insertEmployee" method="post"> -->	
		
		<form:form method="post" modelAttribute="employeeBean" action="insertemployee">
		<table>
			<tr>
				<td>Employee Name</td>
				<!--	<td><input type="text" name="txtEmployeeName"></td>	-->	
				<td><form:input path="employeeName"/></td>
			</tr>
			<tr> 
				<td>Employee Age</td>
				<!--  <td><input type="text" name="txtEmployeeAge"></td>-->		
				<td><form:input path="eAge"/></td>
		
			</tr>
			<tr>
				<td><input type="submit" value="SUBMIT"></td>
			</tr>
		</table>
		</form:form>
	
<!-- </form> -->	
	
	
</body>
</html>