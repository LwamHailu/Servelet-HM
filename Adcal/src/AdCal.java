

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdCal
 */
@WebServlet("/AdCal")
public class AdCal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdCal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tex1=request.getParameter("text1");
		String tex2=request.getParameter("text2");
		String tex3=request.getParameter("text3");
		String tex4=request.getParameter("text4");
		
		int x=Integer.parseInt(tex3);
		int y=Integer.parseInt(tex4);
		int z=Integer.parseInt(tex1);
		int w=Integer.parseInt(tex2);
		Docal cal=new Docal();
		Double mul=cal.mul(x, y);
		int sum=cal.add(z, w);
		PrintWriter out=response.getWriter();
		
		 out.append("<html><head><title>Calculator</title><head>");
			out.append("<body>");
			out.append("<p>"+"The Result is<br>"+" <input type=text size=8 value="+tex1+" >"+"+"+"<input type=text size=8 value="+tex2+" >"
			+"="+"<input type=text size=8 value="+sum+" >"+"<br>"+""
					+ "<input type=text size=8 value="+tex3+" >"+"*"+"<input type=text size=8 value="+tex4+" >"
					+"="+"<input type=text size=8 value="+mul+" >"+"</p>");
			//<input type=text size=8 value="+text2+" >"="
			out.append("</body>");
			out.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
