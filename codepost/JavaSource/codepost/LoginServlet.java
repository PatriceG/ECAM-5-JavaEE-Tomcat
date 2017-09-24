/*
 * Created on 8 oct. 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package codepost;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codepost.data.UserContext;

/**
 * @author pat
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//recup donnees formulaire
	    String userName = request.getParameter("nom");
	    //cree session
	    HttpSession session = request.getSession();
	    //stocke dans session
	    UserContext userContext = new UserContext();
	    userContext.setUserName(userName);
	    session.setAttribute("userContext",userContext);
	    System.out.println("userName="+userContext.getUserName()); 
	    
	    // redirection vers la JSP d'affichage
	    /*
		 * on fait comme ci-dessous si on a besoin de transmettre des infos dans
		 * la requete RequestDispatcher rd =
		 * getServletContext().getRequestDispatcher("/frameset.html");
		 * rd.forward(request,response);
		 */
	    //sinon on fait une simple redirection HTTP
	    response.sendRedirect("frameset.html");
	    } 
	
	 /**
	  * Initializes the servlet.
	  */  
	    public void init(ServletConfig config) throws ServletException {
	        super.init(config);

	    }

	    /**
		 * Destroys the servlet.
		 */  
	    public void destroy() {

	    }
}
