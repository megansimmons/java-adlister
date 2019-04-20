import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;


@WebServlet(urlPatterns = "/hello")
//int count = 0;
public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("This works");

        System.out.println("In HelloWorldServlet.doGet()");

        String count = request.getParameter("count");
//        count ++;

        response.setContentType("text/html");
        PrintWriter gandi = response.getWriter();

        String name = request.getParameter("name");
        if(name == null) name = "World";



        gandi.println("<h1>Hello, " + name + "</h1>");
        gandi.println("<h1>" + count + "</h1>");


//        gandi.println("<h1>Hello, World!</h1>");


//        request.setAttribute("name", name);

     /*   request.setAttribute("count", count);
        request.getRequestDispatcher("/hello.jsp").forward(request, response);*/


    }


/*    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        PrintWriter output = response.getWriter();
        output.println("<h1>Your email is , " + email + "</h1>");

    }*/





}
