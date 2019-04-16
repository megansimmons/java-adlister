import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/count")

public class CountServlet extends HttpServlet {

    int count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        count++;

        String x = request.getParameter("x");
        int x1 = Integer.parseInt(x);
        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        response.getWriter().println("<h2>This page accessed " + count + " times</h2>");



    }


}
