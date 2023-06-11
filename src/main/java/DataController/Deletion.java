package DataController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DataAccessObject.Dao;
import DataTranstactionObject.Dto;

@WebServlet("/deletebyRollNo")
public class Deletion extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		int rollno = Integer.parseInt(req.getParameter("rollno"));
		Dao dao = new Dao();
		String result = dao.remove(rollno);
		List<Dto> list = dao.fetchAll();

		resp.getWriter().print(result);

		req.setAttribute("viewallthedetails", list);
		req.getRequestDispatcher("viewall.jsp").include(req, resp);
	}

}
