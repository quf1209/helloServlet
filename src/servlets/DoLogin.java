package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin") //press��ư�� ������ commit server�� cast�� ���ư���. �׷��� servlet�� ����Ǽ�  dopost()�� �����ش�.����ڿ��� http://localhost:8080/helloServlet/DoLogin response�� ���ƿ´�.
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub //�����  request�� �� ������ ����� ����.
		//read form data
		String username = request.getParameter("username"); //index.html�� �ִ� username�� ���� �޾ƿͼ� �����Ѵ�.
		String password = request.getParameter("password");
		
		//perform business logic : ����Ͻ� ���� ����ϱ�
		
		
		PrintWriter out = response.getWriter(); // response�� client���� html�� response�������� ����. //print��ü
		//Build HTML code
		String htmlResponse="<html>";
		htmlResponse+="<h2> Your name is: " + username + "<br/>";
		htmlResponse+="Your password is: " + password + "<h2/>";
		htmlResponse+="</html>";
		
		out.println(htmlResponse); //clinet���� �����ָ� client�� �� ������ ���������� �� �� �ִ�.
		
		
		
	}

}
