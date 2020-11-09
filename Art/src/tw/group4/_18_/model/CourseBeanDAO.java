package tw.group4._18_.model;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import tw.group4._14_shopAP.model.ARTProduct;

@Repository("CourseBeanDAO")
public class CourseBeanDAO {

	private Session session;
	private SessionFactory sessionFactory;
	
	@Autowired
	public CourseBeanDAO(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

//	public CourseBeanDAO(Session session) {
//		this.session = session;
//	}

	public Course_LN insert(Course_LN co) {
		Session session = sessionFactory.getCurrentSession();

			session.save(co);
			return co;

	}

	public Course_LN select(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Course_LN.class, id);
	}

	public List<Course_LN> selectAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<Course_LN> query = session.createQuery("From Course_LN", Course_LN.class);
		List<Course_LN> list = query.list();
		return list;
	}

	public Course_LN update(String id, String title, int price) {
		Session session = sessionFactory.getCurrentSession();
		Course_LN result = session.get(Course_LN.class, id);
		
		if (result != null) {
			result.setTitle(title);
//			result.setAct_Location(act_Location);
//			result.setLocation_Name(location_Name);
			result.setPrice(price);
//			result.setAct_Time(act_Time);
//			result.setEnd_Time(end_Time);
//			result.setMain_Unit(main_Unit);
		}
		return result;
	}

	public boolean delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		Course_LN result = session.get(Course_LN.class, id);
		if (result != null) {
			session.delete(result);
			return true;
		}
		return false;
	}

}
