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

  body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    padding: 20px;
  }

  form {
    max-width: 400px;
    margin: 0 auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }


  button {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 3px;
    cursor: pointer;
    align-content: center;
  }

  button:hover {
    background-color: #45a049;
  }
  .container h1 {
      text-align: center;
      background-color: red;
    }
    .container h3 {
      text-align: center;
    }
  
</style>
</head>
<nav> <img alt="" src="final-logo2.jpg" align="middle" height="110" width="1350" > </nav>
<body>
<% Dto dto= (Dto) request.getAttribute("updateallview"); %>
<div class="container"> <h1>You can Update </h1>
<form action="updation" method="post">
       <h3>Personal Details</h3>
		Roll_number: <input type="number" name="rollno" value="<%=dto.getRoll_number()%>" readonly="readonly"> <br>
		Name_of_the_candidate <input type="text" name="name" value="<%=dto.getName_of_the_candidate()%>"><br>
		Date_of_birth <input type="date" name="dob" value="<%=dto.getDate_of_birth()%>"><br>
		Father_name <input type="text" name="fathername" value="<%=dto.getFather_name()%>"><br>
		<h3>Marks Details</h3>
		Tamil <input type="number" name="tamilmarks" value="<%=dto.getTamil()%>"><br>
		English <input type="number" name="englishmarks" value="<%=dto.getEnglish()%>"><br>
		Mathematics <input type="number" name="mathsmarks" value="<%=dto.getMathematics()%>"><br> 
		Science <input type="number" name="sciencemarks" value="<%=dto.getScience()%>"><br> 
		Social Science <input type="number" name="socialmarks" value="<%=dto.getSocial_science()%>"><br> <br>

		<button type="submit">Submit</button>
		<button type="reset">Cancel</button>

</form></div>
</body>
</html>