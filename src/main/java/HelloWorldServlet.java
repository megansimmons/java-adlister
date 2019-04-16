import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(urlPatterns = "/hello")

public class HelloWorldServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        System.out.println("This works");
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        output.println("<h1>Hello, " + name + "</h1>");

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        PrintWriter output = response.getWriter();
        output.println("<h1>Your email is , " + email + "</h1>");

    }





}
