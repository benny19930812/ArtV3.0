package tw.group4._18_.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CourseBeanService")
public class CourseBeanService {
	
private CourseBeanDAO cDAO;
	
	public CourseBeanService() {
		
	}

	@Autowired
	public CourseBeanService(CourseBeanDAO cDAO) {
		this.cDAO = cDAO;
	}
	
	public Course_LN insert(Course_LN co) {
		return cDAO.insert(co);

	}
	
	public Course_LN select(String id) {
		return cDAO.select(id);
	}
	
	public List<Course_LN> selectAll() {
		return cDAO.selectAll();
	}
	
	public Course_LN update(String id, String title, int price) {
		return cDAO.update(id, title, price);
	}
	
	public boolean delete(String id) {
		return cDAO.delete(id);
	}
}
