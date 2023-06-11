<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

    <title>Mark Sheet</title>
    <style>
        body {
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
    </style>
</head>
<body>
    <div class="marksheet">
        <div class="header">
            <h1>Mark Sheet</h1>
        </div>
        
        <div class="student-info">
            <p><strong>Student Name:</strong> John Doe</p>
            <p><strong>Roll Number:</strong> 2023-001</p>
            <p><strong>Class:</strong> Grade 10</p>
            <p><strong>Section:</strong> A</p>
        </div>
        
        <table class="subject-table">
            <tr>
                <th>Subject</th>
                <th>Marks</th>
            </tr>
            <tr>
                <td>Mathematics</td>
                <td>98</td>
            </tr>
            <tr>
                <td>Science</td>
                <td>92</td>
            </tr>
            <tr>
                <td>English</td>
                <td>88</td>
            </tr>
            <tr>
                <td>History</td>
                <td>95</td>
            </tr>
        </table>
    </div>
</body>
</html>
