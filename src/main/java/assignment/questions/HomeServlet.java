package assignment.questions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * Caution!: 이 파일은 변경하지 마십시오
 */
@WebServlet("/")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 258161477116725089L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp");
		rd.forward(req, resp);
	}

}
