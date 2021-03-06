package tw.group4._03_.input.ReservationRule;

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

public class CreateReservationRuleTable {

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
		     
		    String sql = "CREATE TABLE CS_CREATIVE_SHOPS_TABLE (SHOP_ID NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY(START WITH 1 INCREMENT BY 1) PRIMARY KEY NOT NULL,  "
		    		+ "NAME VARCHAR2(1000 BYTE), REPRESENT_IMAGE VARCHAR2(2000 BYTE), INTRO VARCHAR2(4000 BYTE), "
		    		+ "CITY_NAME VARCHAR2(1000 BYTE), ADDRESS VARCHAR2(2000 BYTE), LONGITUDE NUMBER(25,20), "
		    		+ "LATITUDE NUMBER(25,20), OPEN_TIME VARCHAR2(1000 BYTE), PHONE VARCHAR2(1000 BYTE), "
		    		+ "FAX VARCHAR2(1000 BYTE), EMAIL VARCHAR2(1000 BYTE), FACEBOOK VARCHAR2(1000 BYTE), "
		    		+ "WEBSITE VARCHAR2(1000 BYTE), CLICKS NUMBER(8,0) )";
		    
		    stmt.executeUpdate(sql);
		    System.out.println("文創商店表格已建立");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
