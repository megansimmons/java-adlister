import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


        //if no parameter called name so it goes to /hello
        //so maybe there's a cookie, maybe they remember what their name is even if not on request parameter
            //cookies array that comes in with request so we always have access to this array
            //list of key value pair that becomes part of the request
            //server will pass these along with the response, they do have a time limit
            //grabbing cookies and looping thru to look for key of name
            //if they do have that name parameter, we will use that one, otherwise we will look through cookies to see if they have set that name parameter before

        String name = request.getParameter("name");
        if(name == null) {
            name = "World";

            Cookie[] cookies = request.getCookies();
                for(Cookie cookie : cookies){
                    if (cookie.getName().equals("name")){
                        name = cookie.getValue();
                    }
                }
        }   else {
            response.addCookie(new Cookie("name", name));

            String newCookieName = request.getParameterMap().keySet().toArray()[0].toString();

            response.getWriter().println("<h1>Hello, " + name + "</h1>");
        }
    }



}