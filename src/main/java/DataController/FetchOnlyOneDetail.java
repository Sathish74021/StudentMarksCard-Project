package DataController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DataAccessObject.Dao;
import DataTranstactionObject.Dto;

@WebServlet("/fetchone")
public class FetchOnlyOneDetail extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		int rollno = Integer.parseInt(req.getParameter("rollno"));
		String dob = req.getParameter("dob");
		Dao dao = new Dao();
		Dto res = dao.FetchoneDetails(rollno);
		if (res != null) {
			if (res.getRoll_number() == rollno && res.getDate_of_birth().equals(dob)) {
				req.setAttribute("mark", res);
				req.getRequestDispatcher("marksheet.jsp").include(req, resp);
			} else {
				resp.getWriter().print("<h1>Student RollNumber or DataOfBirth is Not Correct</h1>");
			}
		} else {
			resp.getWriter().print("<h1>Your Data is not Found</h1>");
		}
	}
}
