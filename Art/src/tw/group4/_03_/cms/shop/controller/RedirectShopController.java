package tw.group4._03_.cms.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectShopController {

	@RequestMapping(path = "/03/cms/shop/Index", method = RequestMethod.GET)
	public String redirectToIndex() {
		return "03/cms/shop/index";
	}

	@RequestMapping(path = "/03/cms/shop/Create", method = RequestMethod.GET)
	public String redirectToCreate() {
		return "03/cms/shop/create";
	}
	
	@RequestMapping(path = "/03/cms/shop/Search", method = RequestMethod.GET)
	public String redirectToSearch() {
		return "03/cms/shop/search";
	}
	
	@RequestMapping(path = "/03/cms/shop/Update", method = RequestMethod.GET)
	public String redirectToUpdate() {
		return "03/cms/shop/update";
	}
	
	@RequestMapping(path = "/03/cms/shop/Delete", method = RequestMethod.GET)
	public String redirectToDelete() {
		return "03/cms/shop/delete";
	}
	
	
	
	
	
	
	
}
