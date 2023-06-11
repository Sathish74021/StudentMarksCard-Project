<%@page import="DataTranstactionObject.Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style> 
        table {
            border-collapse: collapse;
            width: 100%;
        }
        
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
      
        th {
            background-color: #f2f2f2;
        }
   
h1 {
	text-align: center;
	background-color: red;
}
</style>
</head>
<body>
<nav> <img alt="" src="final-logo2.jpg" align="middle" height="110" width="1350" > </nav>
	<%
	List<Dto> list = (List<Dto>) request.getAttribute("viewallthedetails");
	%>
	<h1>All candidate Details</h1>
	<table border="">
		<tr>
			<th>Roll Number</th>
			<th>Name of the Candidate</th>
			<th>Date of birth</th>
			<th>Father Name</th>
			<th>Tamil</th>
			<th>English</th>
			<th>Mathematics</th>
			<th>Science</th>
			<th>Social Science</th>
			<th>Total Marks</th>
			<th>Percentage</th>
		</tr>
   <% for(Dto d:list){ %>
     <tr>
     <td><%=d.getRoll_number()%></td>
     <td><%=d.getName_of_the_candidate()%></td>
     <td><%=d.getDate_of_birth() %></td>
     <td><%=d.getFather_name() %></td>
     <td><%=d.getTamil() %></td>
     <td><%=d.getEnglish() %></td>
     <td><%=d.getMathematics() %></td>
     <td><%=d.getScience() %></td>
     <td><%=d.getSocial_science() %></td>
     <td><%=d.getTotal_marks() %></td>
     <td><%=d.getPercentage() %></td>
     </tr>
   
<%} %>

	</table>
</body>
</html>