package assignment.answers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/*
[TODOS]
- 본 서블릿을 /users/logout의 요청에 반응하도록 만들어 주십시오(GET, POST 방식에 관계 없이 작동하게 해 주십시오)
- HttpSession을 무효화(invalidate)하고 홈 페이지로 리다이렉트(Redirect)해 주십시오.
 */
@WebServlet("/users/logout")
public class UserLogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processLogout(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processLogout(request, response);
    }

    private void processLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);
        
        
        if (session != null) {
            session.invalidate();
        }
        
       
        response.sendRedirect(request.getContextPath() + "/");
    }
}
