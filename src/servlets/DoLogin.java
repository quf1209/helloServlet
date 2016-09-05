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
@WebServlet("/DoLogin") //press버튼을 누르면 commit server에 cast가 날아간다. 그러면 servlet이 실행되서  dopost()을 보여준다.사용자에게 http://localhost:8080/helloServlet/DoLogin response가 날아온다.
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
		// TODO Auto-generated method stub //사용자  request가 올 때마다 만들어 진다.
		//read form data
		String username = request.getParameter("username"); //index.html에 있는 username의 값을 받아와서 저장한다.
		String password = request.getParameter("password");
		
		//perform business logic : 비즈니스 로직 출력하기
		
		
		PrintWriter out = response.getWriter(); // response가 client에게 html로 response로직으로 들어간다. //print객체
		//Build HTML code
		String htmlResponse="<html>";
		htmlResponse+="<h2> Your name is: " + username + "<br/>";
		htmlResponse+="Your password is: " + password + "<h2/>";
		htmlResponse+="</html>";
		
		out.println(htmlResponse); //clinet에게 보여주며 client는 그 내용을 브라우저에서 볼 수 있다.
		
		
		
	}

}
