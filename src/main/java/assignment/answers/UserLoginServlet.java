package assignment.answers;

import java.io.IOException;

import assignment.answers.vo.UserVo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/*
[TODOS]
- 본 서블릿을 /users/login의 POST 메서드에 반응하도록 만들어 주십시오
- 전달된 HTML 폼의 데이터를 userId와 userPassword로 받아 주십시오
- 정상적인 사용자 정보는 CORRECT_USERID, CORRECT_USERPASSWORD에 담겨 있습니다. 
- 입력한 userId가 CORRECT_USERID와 일치하고 userPassword가 CORRECT_USERPASSWORD와 일치하면
	- UserVo에 해당 정보를 담아서 HttpSession에 authUser로 속성 추가해 주십시오.
- 성공, 실패에 관계 없이, 홈 페이지로 리다이렉트(Redirect)해 주십시오.
 */
@WebServlet("/users/login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = -4744279009417543375L;
	private static String CORRECT_USERID = "himedia";
	private static String CORRECT_USERPASSWORD = "himedia";
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	        String userId = request.getParameter("userId");
	        String userPassword = request.getParameter("userPassword");
	        
	        
	        if (userId != null && userId.equals(CORRECT_USERID) && userPassword != null && userPassword.equals(CORRECT_USERPASSWORD)) {
	            
	            UserVo authUser = new UserVo(userId, userPassword); 
	            HttpSession session = request.getSession(true); 
	            session.setAttribute("authUser", authUser);
	        }
	        
	       
	        response.sendRedirect(request.getContextPath() + "/");
	    }

}
