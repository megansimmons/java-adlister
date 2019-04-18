import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //HttpSession session = request.getSession();  this could be a separate step but is the same as is done belowe in if statement
        if(request.getSession().getAttribute("user") != null){
            response.sendRedirect("/profile");
        } else request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getMethod().equalsIgnoreCase("post")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            boolean validAttempt = username.equals("admin") && password.equals("password");

            if (validAttempt) {
                HttpSession session = request.getSession();
                session.setAttribute("user", username);
                //do NOT put password in here because it will be stored in a cookie!
                response.sendRedirect("/profile");
            } else {
                response.sendRedirect("/login");
            }
        }
    }
}

/*
    1. Lock down your profile page

        -Ensure that users can only visit the /profile page if they are logged in.
        -In your LoginServlet, when a user successfully logs in, set a key named "user" in the session.
        -use this key to redirect unauthorized users that try to visit the /profile page.

        -if a user is already logged in and they visit /login, instead redirect them to their profile page
        -Allow users to logout

    2. When a user visits /logout, they should be logged out of your application and redirected to the login page.

    3. Add a message on your profile page that welcomes the currently logged in user.*/
