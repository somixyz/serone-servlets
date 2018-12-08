package serone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		String userName = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		pw.println("Login Success.....");

		if (userName.equals("Milos") & password.equals("Milos")) {
			pw.println("Login success.....");
		} else {
			pw.println("Login Failed");
		}
		pw.close();

	}

}
