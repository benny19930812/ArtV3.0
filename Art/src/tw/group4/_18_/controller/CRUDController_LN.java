package tw.group4._18_.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tw.group4._18_.model.CourseBeanService;
import tw.group4._18_.model.Course_LN;

@Controller
public class CRUDController_LN {
	
	@Autowired
	private CourseBeanService cDAOseBeanService;
	
	@RequestMapping(path = "/18/123.ctrl" ,method = RequestMethod.GET)
	public String processActionSelectAll(Model m) {
		List<Course_LN> selectAll = cDAOseBeanService.selectAll();
		m.addAttribute("cList", selectAll);
		return "18_selectALL";
	}
	
	
	
	@RequestMapping(path = "/18/456.ctrl" ,method = RequestMethod.GET)
	public String processActionInsert(Model m, @RequestParam(name= "inputID")String id, @RequestParam(name= "inputTitle")String title, @RequestParam(name= "inputPrice")Integer price) {
		
		Course_LN co = new Course_LN();
		co.setId(id);
		co.setTitle(title);
		co.setPrice(price);
		
		cDAOseBeanService.insert(co);
		m.addAttribute("successLN", "success");
		return "redirect:/18/123.ctrl";
	}
	
	@RequestMapping(path="/18/insertData.ctrl")
	public String processActionInsert2() {
		return "18_insert";
		
	}
	
	
	
	@RequestMapping(path = "/18/789.ctrl", method = RequestMethod.GET)
	public String processActionDelete(Model m, @RequestParam(name= "inputID")String id) {
		cDAOseBeanService.delete(id);
		m.addAttribute("DeleteSuccessLN", "success Delete");
		return "redirect:/18/123.ctrl";
		
	}
	
	@RequestMapping(path = "/18/DeleteData.ctrl")
	public String processActionDelete2() {
		return "18_Delete";
	}
	
	
	
	@RequestMapping(path = "/18/000.ctrl", method = RequestMethod.GET)
	public String processActionUpdate(Model m, @RequestParam(name = "id")String id, @RequestParam(name= "inputTitle")String title, @RequestParam(name= "inputPrice")Integer price) {
		System.out.println("id"+id); //
		Course_LN co = cDAOseBeanService.select(id);
		m.addAttribute("co", co); //
		
		m.addAttribute("UpdateDeleteSuccessLN", "Update success");
		
		return "redirect:/18/123.ctrl";
	}
	
	@RequestMapping(path = "/18/UpdateData.ctrl")
	public String processActionUpdate2(Model m, @RequestParam(name = "id")String id, @RequestParam(name= "inputTitle")String title, @RequestParam(name= "inputPrice")Integer price) {
				
		//
		cDAOseBeanService.update(id, title, price);
		
		return "18_Update";
	}

}
