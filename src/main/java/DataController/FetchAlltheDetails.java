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

@WebServlet("/viewall")
public class FetchAlltheDetails extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		Dao dao = new Dao();
		List<Dto> res = dao.fetchAll();
		req.setAttribute("viewallthedetails", res);
		req.getRequestDispatcher("viewall.jsp").include(req, resp);
	}
}
