package tw.group4._03_.input;

import java.util.ArrayList;

import tw.group4._03_.input.CreativeShop.CreateShopsTable;
import tw.group4._03_.input.CreativeShop.ShopsTable;
import tw.group4._03_.input.ShopReservation.CreateReservationTable;

public class CreateTable03 {

	public void executeCreateTable() {

		CreateShopsTable input = new CreateShopsTable();

		// 刪除舊的文創商店表格
		input.dropShopsTable();

		// 建立文創商店表格
		input.createShopsTableForDB();

		// 讀取Json轉換成list
		ArrayList<ShopsTable> list = input.readJsonToTable();

		// 將list讀進DB
		input.creatShopsInfoTable(list);

		// =============================

		CreateReservationTable input2 = new CreateReservationTable();

		// 刪除舊的文創商店表格
		input2.dropReservationTable();

		// 建立文創商店表格
		input2.createReservationTableForDB();

		// =============================

	}
}
