import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet
{
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doDelete(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		List<Model>list = Dao.viewdata();
		
		out.print("<table border='1'>");
		
		out.print("<tr><td>ID</td><td>Name</td><td>Surname</td><td>Email</td><td>Edit</td><td>Delete</td></tr>");
		
		for(Model m :list)
		{
			
			out.print("<tr><td>"+m.getId()+"</td><td>"+m.getName()+"</td><td>"+m.getSurname()+"</td><td>"+m.getEmail()+"</td><td><a href=''>Edit</a></td><td><a href=''>Delete</a></td></tr>");
		}
		
		out.print("<a href='form.html'>Add Data</a>");
		
		out.print("</table>");
		
	}

}
