import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class EmployeeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";  // your MySQL username
        String pass = "password";  // your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            out.println("<h2>Employee Records</h2>");
            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Department</th><th>Salary</th></tr>");

            while (rs.next()) {
                out.println("<tr><td>" + rs.getInt("id") + "</td><td>"
                        + rs.getString("name") + "</td><td>"
                        + rs.getString("department") + "</td><td>"
                        + rs.getDouble("salary") + "</td></tr>");
            }
            out.println("</table>");
            out.println("<br><a href='attendance.jsp'>Go to Attendance Portal</a>");

            con.close();
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
}
