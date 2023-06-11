package DataAccessObject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DataTranstactionObject.Dto;

public class Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insertion(Dto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
		return "Student details Succesfully Inserted";
	}

	public List<Dto> fetchAll() {
		Query q1 = em.createQuery("select data from Student_Marks_Card data");

		List<Dto> l1 = q1.getResultList();
		return l1;

	}

	public String remove(int rollNo) {
		Dto std = em.find(Dto.class, rollNo);
		if (std != null) {
			et.begin();
			em.remove(std);
			et.commit();
			return "<h1>Student detail is deleted </h1>";
		} else {
			return "<h1>Student details not found</h1>";
		}
	}

	public Dto FindUpdate(int rollno) {
		Dto res = em.find(Dto.class, rollno);
		return res;
	}

	public String Updation(Dto dto) {
		et.begin();
		em.merge(dto);
		et.commit();
		return "Student Details Successfully Updated";
	}

	public Dto FetchoneDetails(int rollno) {
		Dto one = em.find(Dto.class, rollno);
		return one;
	}

}
