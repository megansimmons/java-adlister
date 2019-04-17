import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cats")
public class CatsServlet extends HttpServlet {

//    CatHerder dao = new CatHerder();

    Cats dao = DaoFactory.getCatsDao();

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
        //grabbing info from backend of server and passing into jsp

        req.setAttribute("cats", dao.getAllCats());
        req.getRequestDispatcher("/CatsList.jsp").forward(req, res);


    }
}
