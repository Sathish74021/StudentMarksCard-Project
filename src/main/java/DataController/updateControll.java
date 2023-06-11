package DataController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DataAccessObject.Dao;
import DataTranstactionObject.Dto;

@WebServlet("/findupdate")
public class updateControll extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		int roll = Integer.parseInt(req.getParameter("rollno"));
		String dob = req.getParameter("dob");
		Dao dao = new Dao();
		Dto dto = dao.FindUpdate(roll);
		if (dto != null) {
			if (dto.getRoll_number() == roll && dto.getDate_of_birth().equals(dob)) {
                 req.setAttribute("updateallview", dto);
                 req.getRequestDispatcher("updateview.jsp").include(req, resp);
			} else {
				resp.getWriter().print("<h1>your Roll number or DOB is Wrong</h1>");
				req.getRequestDispatcher("update.html").include(req, resp);
			}
		} else {
			resp.getWriter().print("<h1> Data Not Found </h1>");
		}

	}
}
