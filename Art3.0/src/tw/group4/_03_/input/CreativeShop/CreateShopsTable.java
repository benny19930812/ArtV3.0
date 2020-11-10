package tw.group4._03_.input.CreativeShop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class CreateShopsTable {

	private DataSource dataSource;

	public DataSource getDataSource() {// 只需get因為只要用不希望被改

		// lazy init，能有多晚用到就多晚產生，放constructor會先產出佔用記憶體
		if (dataSource == null) { // 不希望重複產生，
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName("oracle.jdbc.OracleDriver");
			ds.setUrl("jdbc:oracle:thin:@//localhost:1521/xepdb1");
			ds.setUsername("group4");
			ds.setPassword("oracle");
			ds.setMaxTotal(50);
			ds.setMaxIdle(50);

			dataSource = ds; // 把BasicDataSource放在屬性上
		}
		return dataSource;
	}
	
	public void dropShopsTable() {
		try (Connection connection = getDataSource().getConnection();) {
			Statement stmt = connection.createStatement();
			
		    String sql = "DROP TABLE CS_CREATIVE_SHOPS_TABLE CASCADE CONSTRAINTS";
	    
		    stmt.executeUpdate(sql);
		    System.out.println("文創商店表格已刪除");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void createShopsTableForDB(){
		try (Connection connection = getDataSource().getConnection();) {
			Statement stmt = connection.createStatement();
		     
		    String sql = "CREATE TABLE CS_CREATIVE_SHOPS_TABLE (SHOP_ID NUMBER GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) PRIMARY KEY NOT NULL,  "
		    		+ "NAME VARCHAR2(1000 BYTE), REPRESENT_IMAGE VARCHAR2(2000 BYTE), INTRO VARCHAR2(4000 BYTE), "
		    		+ "CITY_NAME VARCHAR2(1000 BYTE), ADDRESS VARCHAR2(2000 BYTE), LONGITUDE NUMBER(25,20), "
		    		+ "LATITUDE NUMBER(25,20), OPEN_TIME VARCHAR2(1000 BYTE), PHONE VARCHAR2(1000 BYTE), "
		    		+ "FAX VARCHAR2(1000 BYTE), EMAIL VARCHAR2(1000 BYTE), FACEBOOK VARCHAR2(1000 BYTE), "
		    		+ "WEBSITE VARCHAR2(1000 BYTE), CLICKS NUMBER(8,0) )";
		    
		    stmt.executeUpdate(sql);
		    System.out.println("藝文商店表格已建立");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<ShopsTable> readJsonToTable() {

		ArrayList<ShopsTable> list = new ArrayList<ShopsTable>();
		
		//未來路徑有變動可能
		try (InputStream is = new FileInputStream("inputJSON/CreativeShops.json");
				InputStreamReader isr = new InputStreamReader(is, "UTF8");
				BufferedReader br = new BufferedReader(isr);) {
			int c;
			StringBuilder strBuilder = new StringBuilder();
			while ((c = br.read()) != -1) {
				char d = (char) c;
				strBuilder.append(String.valueOf(d));
			}

			String tableStr = String.valueOf(strBuilder);
//			System.out.println(tableStr);

			Gson gson = new Gson();
			Type listType = new TypeToken<ArrayList<ShopsTable>>() {
			}.getType();

			ArrayList<ShopsTable> jsonArr = gson.fromJson(tableStr, listType);

			for (ShopsTable item : jsonArr) {
				ShopsTable shops = new ShopsTable();
			
				shops.setShopId(item.getShopId());
				shops.setName(item.getName());
				shops.setRepresentImage(item.getRepresentImage());
				shops.setIntro(item.getIntro());
				shops.setCityName(item.getCityName());
				
				shops.setAddress(item.getAddress());
				shops.setLongitude(item.getLongitude());
				shops.setLatitude(item.getLatitude());
				shops.setOpenTime(item.getOpenTime());
				shops.setPhone(item.getPhone());
				
				shops.setFax(item.getFax());
				shops.setEmail(item.getEmail());
				shops.setFacebook(item.getFacebook());
				shops.setWebsite(item.getWebsite());
				shops.setClicks(item.getClicks());

				list.add(shops);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("已成功轉換json");
		return list;

	}

	double customizeParseDouble(String strNumber) {
		if (strNumber != null && strNumber.length() > 0) {
			try {
				return Double.parseDouble(strNumber);
			} catch (Exception e) {
				return -1; // or some value to mark this field is wrong. or make a function validates field
							// first ...
			}
		} else
			return 0;
	}

	public void creatShopsInfoTable(ArrayList<ShopsTable> list) {

		try (Connection connection = getDataSource().getConnection();
				PreparedStatement pstmt = connection.prepareStatement("INSERT INTO CS_CREATIVE_SHOPS_TABLE "
								+ "(name, represent_image, intro, city_name, "
								+ "address, longitude, latitude, open_time, phone, "
								+ "fax, email, facebook, website, clicks) "
								+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");) {

			for (ShopsTable shop : list) {				
			
				pstmt.setString(1, shop.getName());
				pstmt.setString(2, shop.getRepresentImage());
				pstmt.setString(3, shop.getIntro());
				pstmt.setString(4, shop.getCityName());
				
				pstmt.setString(5, shop.getAddress());	
				pstmt.setDouble(6, customizeParseDouble(shop.getLongitude()));
				pstmt.setDouble(7, customizeParseDouble(shop.getLatitude()));
				pstmt.setString(8, shop.getOpenTime());
				pstmt.setString(9, shop.getPhone());
				
				pstmt.setString(10, shop.getFax());
				pstmt.setString(11, shop.getEmail());
				pstmt.setString(12, shop.getFacebook());
				pstmt.setString(13, shop.getWebsite());
				pstmt.setInt(14, Integer.parseInt(shop.getClicks()));
				
				pstmt.executeUpdate();
				pstmt.clearParameters();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("商店資料已新增");
	}
}
