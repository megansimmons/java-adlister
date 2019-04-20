import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns ="/dogs")
public class DogsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Dogs dogsDao = DaoFactory.getDogsDao();
        List<Dog> dogs = dogsDao.all();
        request.setAttribute("dogs", dogs);
        request.getRequestDispatcher("/dogsIndex.jsp").forward(request, response);

    }
}
