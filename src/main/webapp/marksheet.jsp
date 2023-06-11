<%@page import="DataTranstactionObject.Dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 body   {
            font-family: Arial, sans-serif;
        }
        
        .marksheet {
            width: 600px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        
        .header {
            text-align: center;
            margin-bottom: 20px;
        }
        
        .header h1 {
            font-size: 24px;
            margin: 0;
        }
        
        .student-info {
            margin-bottom: 20px;
        }
        
        .subject-table {
            width: 100%;
            border-collapse: collapse;
        }
        
        .subject-table th,
        .subject-table td {
            padding: 10px;
            text-align: center;
            border: 1px solid #ccc;
        }
        
        .subject-table th {
            background-color: #f2f2f2;
        }
        
        .subject-table td:first-child {
            text-align: left;
        }
   
         div>h1{
         background-color: red;
        }
</style>
</head>
<nav> <img alt="" src="final-logo2.jpg" align="middle" height="110" width="1350" > </nav>
<body>
<% Dto dto=(Dto)request.getAttribute("mark"); %>
 <div class="marksheet">
        <div class="header">
            <h1>Result Sheet</h1>
        </div>
        
        <div class="student-info">
            <p><strong>Name of the candidate: </strong> <%=dto.getName_of_the_candidate() %></p>
            <p><strong>Roll Number: </strong> <%=dto.getRoll_number() %></p>
            <p><strong>Father Name: </strong> <%=dto.getFather_name() %></p>
        </div>
        
        <table class="subject-table">
            <tr>
                <th>Subject</th>
                <th>Marks</th>
            </tr>
            <tr>
                <td>Tamil</td>
                <td><%=dto.getTamil() %></td>
            </tr>
            <tr>
                <td>English</td>
                <td><%=dto.getEnglish() %></td>
            </tr>
            <tr>
                <td>Mathematics</td>
                <td><%=dto.getMathematics() %></td>
            </tr>
            <tr>
                <td>Science</td>
                <td><%=dto.getScience() %></td>
            </tr>
            <tr>
                <td>Social Science</td>
                <td><%=dto.getSocial_science() %></td>
            </tr>
            <tr>
                <td>Total Marks</td>
                <td><%=dto.getTotal_marks() %></td>
            </tr>
            <tr>
                <td>Percentage</td>
                <td><%=dto.getPercentage() %></td>
            </tr>
            
        </table>
    </div>
</body>
</html>