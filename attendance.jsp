<html>
<head><title>Student Attendance</title></head>
<body>
<h2>Mark Student Attendance</h2>
<form action="attendance" method="post">
  Student Name: <input type="text" name="name"><br><br>
  Status:
  <select name="status">
    <option>Present</option>
    <option>Absent</option>
  </select><br><br>
  <input type="submit" value="Submit">
</form>
<br>
<a href="viewAttendance.jsp">View Attendance</a>
</body>
</html>
