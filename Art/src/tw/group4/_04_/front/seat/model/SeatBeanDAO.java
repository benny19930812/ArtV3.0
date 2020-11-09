package tw.group4._04_.front.seat.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository("SeatBeanDAO")
public class SeatBeanDAO {

	@Autowired
	private SeatBean seatBean;
	private SessionFactory sessionFacory;
	private Session session;


//	public SeatBeanDAO() {
//	
//	}	
	// DAO一叫出來就幫忙取完session了
	// 現在都在DAO層用SessionFactory幫忙做事
	// 不再傳遞session一層一層下去
	@Autowired
	public SeatBeanDAO(@Qualifier("sessionFactory") SessionFactory sessionFacory) {
		this.sessionFacory = sessionFacory;
	}

	// 新增
	public SeatBean insert(SeatBean SeatBean) {
		Session session = sessionFacory.getCurrentSession();

			session.save(SeatBean);
			return SeatBean;

	}

//	// 查詢
//	public Map<String, Integer> select(int actno) {
//		Session session = sessionFacory.getCurrentSession();
//		Map<String,Integer> SeatMap = new HashMap<>();
//		SeatMap.put("A1",seatBean.getA1());
//		SeatMap.put("A2",seatBean.getA2());
//		SeatMap.put("A3",seatBean.getA3());
//		SeatMap.put("A4",seatBean.getA4());
//		SeatMap.put("A5",seatBean.getA5());		
//		return SeatMap;
//	}

	// 修改
	public SeatBean update(int actno) {

		Session session = sessionFacory.getCurrentSession();
		SeatBean SeatBean = session.get(SeatBean.class, actno);

		if (SeatBean != null) {
//			SeatBean.setACT_TITLE(title);
//			SeatBean.setACT_CATEGORY(category);
//			SeatBean.setACT_LOCATION(locationName);
//			SeatBean.setACT_MAINUNIT(mainunit);
//			SeatBean.setACT_SHOWUNIT(showunit);
//			SeatBean.setACT_DESCRIPTION(description);
//			SeatBean.setACT_STARTDATE(startdate);
//			SeatBean.setACT_ENDDATE(enddate);
		}

		return SeatBean;
	}

	// 刪除
	public boolean delete(int actno) {

		Session session = sessionFacory.getCurrentSession();
		SeatBean result = session.get(SeatBean.class, actno);

		if (result != null) {
			session.delete(result);
			return true;
		}

		return false;
	}

	
}
