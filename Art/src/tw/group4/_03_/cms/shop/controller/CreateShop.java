package tw.group4._03_.cms.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tw.group4._03_.cms.shop.model.CreativeShopBean;
import tw.group4._03_.cms.shop.model.CreativeShopService;
import tw.group4._03_.cms.util.CustomizedTypeConversion;

@Controller
public class CreateShop {

	@Autowired
	private CreativeShopService css;

	@RequestMapping(path = "/03/cms/shop/CreateCreativeShop.ctrl", method = RequestMethod.POST)
	public String createCreativeShop(
			@RequestParam(name="name") String name, 
			@RequestParam(name="representImage") String representImage,
			@RequestParam(name="intro") String intro, 
			@RequestParam(name="cityName") String cityName,
			
			@RequestParam(name="address") String address,
			@RequestParam(name="longitude") String longitude,
			@RequestParam(name="latitude") String latitude,
			@RequestParam(name="openTime") String openTime,
			@RequestParam(name="phone") String phone,
			
			@RequestParam(name= "fax") String fax,
			@RequestParam(name= "email") String email,
			@RequestParam(name= "facebook") String facebook,
			@RequestParam(name= "website") String website,
			@RequestParam(name= "clicks") String clicks,
			Model m) {
		try {
			
			CreativeShopBean shop = new CreativeShopBean();
			
//			測試
			System.out.println("ShopId = " + shop.getShopId());
			
			shop.setName(name);
			shop.setRepresentImage(representImage);
			shop.setIntro(intro);
			shop.setCityName(cityName);

			shop.setAddress(address);
			shop.setLongitude(CustomizedTypeConversion.customizedParseDouble(longitude));
			shop.setLatitude(CustomizedTypeConversion.customizedParseDouble(latitude));
			shop.setOpenTime(openTime);
			shop.setPhone(phone);

			shop.setFax(fax);
			shop.setEmail(email);
			shop.setFacebook(facebook);
			shop.setWebsite(website);
			shop.setClicks(CustomizedTypeConversion.customizedParseInt(clicks));

			css.insert(shop);
			
			System.out.println(shop.getShopId());
			
			
			String acShopsCreateMsg = "商店資料新建成功";
			m.addAttribute("acShopsCreateMsg", acShopsCreateMsg);

		} catch (Exception e) {
			e.printStackTrace();

			String acShopsCreateMsg = "商店資料新建失敗";
			m.addAttribute("acShopsCreateMsg", acShopsCreateMsg); // 回傳錯誤訊息
		}

		return "03/cms/shop/create_return";

	}

}
