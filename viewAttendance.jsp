<%@ page import="java.sql.*" %>
<html>
<head><title>View Attendance</title></head>
<body>
<h2>Attendance Records</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Status</th></tr>
<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "password");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM attendance");

    while(rs.next()){
        out.println("<tr><td>"+rs.getInt("id")+"</td><td>"+rs.getString("name")+"</td><td>"+rs.getString("status")+"</td></tr>");
    }
    con.close();
} catch(Exception e){
    out.println("<p>Error: "+e.getMessage()+"</p>");
}
%>
</table>
</body>
</html>
