package webapp.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserProfile
 */
@WebServlet(urlPatterns = "/profile.do")
public class UserProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    UserProfile userProfile = new UserProfile(); 
    
    public UserProfileServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getSession().getAttribute("id").toString(); 
		request.setAttribute("Name", userProfile.getProfile(id).getFirstName()+' '+ userProfile.getProfile(id).getLastName()); 
		request.setAttribute("salary", userProfile.getProfile(id).getSalary());
		request.setAttribute("errorMessage","invalid credentials!");
		request.setAttribute("department", userProfile.getDepartment(id).toString());
		request.getRequestDispatcher("/WEB-INF/views/profile.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
	}

}
