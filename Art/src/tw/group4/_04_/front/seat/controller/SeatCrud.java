package tw.group4._04_.front.seat.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.group4._04_.back.model.ShowBean;
import tw.group4._04_.front.seat.model.SeatBean;
import tw.group4._04_.front.seat.model.SeatBeanDAO;
import tw.group4._04_.front.seat.model.SeatBeanService;

@Controller
public class SeatCrud {
	
	@Autowired
	private SeatBean seatBean;
	@Autowired
	private SeatBeanService seatBeanService;
	
	//search seat
	
//	@RequestMapping(path = "/04/seatSearch.ctrl", method = RequestMethod.GET)
//	public @ResponseBody Map<String, Integer> seatSearch() {
//		int actno = 1;
//		Map<String,Integer> SeatMap = new HashMap<>();
//				seatBeanService.select(actno);
//				SeatMap.put("A1",seatBean.getA1());
//				SeatMap.put("A2",seatBean.getA2());
//				SeatMap.put("A3",seatBean.getA3());
//				SeatMap.put("A4",seatBean.getA4());
//				SeatMap.put("A5",seatBean.getA5());
//		return SeatMap;
//	}
}
