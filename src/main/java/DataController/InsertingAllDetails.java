package DataController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DataAccessObject.Dao;
import DataTranstactionObject.Dto;

@WebServlet("/insertingAll")
public class InsertingAllDetails extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		String roll=req.getParameter("rollno");
		int rollNo = Integer.parseInt(roll);
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String fathername = req.getParameter("fathername");
		int tamilmark = Integer.parseInt(req.getParameter("tamilmarks"));
		int englishmark = Integer.parseInt(req.getParameter("englishmarks"));
		int mathsmark = Integer.parseInt(req.getParameter("mathsmarks"));
		int sciencemark =Integer.parseInt(req.getParameter("sciencemarks"));
		int socialmark = Integer.parseInt(req.getParameter("socialmarks"));

		int totalmark = tamilmark + englishmark + mathsmark + sciencemark + socialmark;
		double percentage = (totalmark * 100) / 500;
		
		Dto dto = new Dto();
		dto.setRoll_number(rollNo);
		dto.setName_of_the_candidate(name);
		dto.setDate_of_birth(dob);
		dto.setFather_name(fathername);
		dto.setTamil(tamilmark);
		dto.setEnglish(englishmark);
		dto.setMathematics(mathsmark);
		dto.setScience(sciencemark);
		dto.setSocial_science(socialmark);
		dto.setTotal_marks(totalmark);
		dto.setPercentage(percentage);
		
		Dao dao=new Dao();
		String res=dao.insertion(dto);
		resp.getWriter().print(res);

	}

}
