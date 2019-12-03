import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@WebServlet(urlPatterns={"/patients"},loadOnStartup = 1)
public class MyServlet extends HttpServlet
{
    private static final Logger log= Logger.getLogger(MyServlet.class.getName());

    public MyServlet()
    {
        log.info("In constructor");
        log.warning("Running low on memory");
        log.severe("Can't allocate memory");
        
        LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("Hello, world!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
    }

}