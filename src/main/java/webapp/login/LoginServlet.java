package webapp.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.user.UserProfile;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
    
    LoginValidation validation = new LoginValidation(); 
    UserProfile userProfile = new UserProfile(); 
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password"); 
		
		if (validation.isValid(userName, password)) {
			
			String fullName = userProfile.getName(userName);
			String id  = userProfile.getID(userName);
			
			request.getSession().setAttribute("name", fullName);
			request.getSession().setAttribute("id", id);
			
			
						
			response.sendRedirect("profile.do");
			
		
		
		} else {
			
			request.setAttribute("errorMessage","invalid credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
		
	}

}
