import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AttendanceServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String status = req.getParameter("status");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "password");

            PreparedStatement ps = con.prepareStatement("INSERT INTO attendance(name, status) VALUES(?, ?)");
            ps.setString(1, name);
            ps.setString(2, status);
            ps.executeUpdate();

            out.println("<h3>Attendance Marked Successfully!</h3>");
            out.println("<a href='attendance.jsp'>Mark Another</a><br>");
            out.println("<a href='viewAttendance.jsp'>View Attendance</a>");
            con.close();
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
}
