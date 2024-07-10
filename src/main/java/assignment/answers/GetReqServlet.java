package assignment.answers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
[TODOS]
- 본 서블릿을 /getreq에 반응하도록 만들어 주십시오
- 전달된 name, age, location 파라미터를 받아 
- /WEB-INF/views/getreq.jsp로 forward 해 주십시오.
 */
@WebServlet("/getreq")
public class GetReqServlet extends HttpServlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	        String name = request.getParameter("name");
	        String age = request.getParameter("age");
	        String location = request.getParameter("location");

	        
	        request.setAttribute("name", name);
	        request.setAttribute("age", age);
	        request.setAttribute("location", location);

	        
	       
	        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/getreq.jsp");
	        dispatcher.forward(request, response);
	    }
}
