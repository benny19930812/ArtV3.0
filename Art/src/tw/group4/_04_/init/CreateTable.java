package tw.group4._04_.init;

import java.util.ArrayList;
import java.util.List;

public class CreateTable {

	public void execute04() {
				
		JDBCDAO jdbcdao = new JDBCDAO();

//		1.表格
		jdbcdao.dropTableMT();; //刪Maintable表格
		jdbcdao.dropTableOL(); //刪ORDERLIST表格
		jdbcdao.dropTableON(); //刪ORDERNUM表格
		jdbcdao.createTableOL(); //創ORDERLIST表格
		jdbcdao.createTableOU(); //創ORDERNUM表格
		jdbcdao.createTableMT();//創Maintable表格
		System.out.println("04的表格已建立");
		
//		MainTable表格插入資料
		ArrayList<MainTable> listMT = jdbcdao.readJsonToMT(); //讀取網路上的json到MainTable資料型態
		jdbcdao.mtWriteDB(listMT); //寫入資料到資料庫內的MainTable表格


	}

}
