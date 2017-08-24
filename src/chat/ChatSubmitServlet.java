package chat;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChatSubmitServlet")
public class ChatSubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	System.out.println("서블");
   
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String chatName = request.getParameter("chatName");
		String chatContent = request.getParameter("chatContent");
		if (chatName == null || chatName.equals("") || chatContent == null || chatContent.equals("")) {
			response.getWriter().write("0");
		} else { 
			System.out.println("서블릿 데이터값"+new Dao().submit(chatName, chatContent));
			response.getWriter().write(new Dao().submit(chatName, chatContent));
		}  

	}

}