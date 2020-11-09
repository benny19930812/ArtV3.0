package tw.group4;

import tw.group4._03_.input.ExecuteCreateTable03;
import tw.group4._04_.init.CreateTable;
import tw.group4._11_.createTable.createTableSA;
import tw.group4._14_shopAP.init.APTableReset;
import tw.group4._18_._18_io.TestOnly;
import tw.group4._35_.init.model.CreateTableInsertDataService;

public class IntializeDatabase {
	
	public static void main(String[] args) {
		
//		全部執行完畢需時30-60秒
		new ExecuteCreateTable03().execute03();
		new CreateTable().execute04();
		new createTableSA().execute11();
		new APTableReset().execute14();
		new TestOnly().execute18();
		new CreateTableInsertDataService().execute35();
	}
}
