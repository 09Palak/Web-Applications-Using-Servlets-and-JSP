import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if (user.equals("admin") && pass.equals("12345")) {
            out.println("<h2>Login Successful!</h2>");
            out.println("<p>Welcome, " + user + "!</p>");
            out.println("<a href='employee'>View Employee Records</a><br>");
            out.println("<a href='attendance.jsp'>Go to Attendance Portal</a>");
        } else {
            out.println("<h2>Login Failed!</h2>");
            out.println("<a href='index.html'>Try Again</a>");
        }
    }
}
