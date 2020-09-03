package Basic.Selenium;

public class DBRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	JDBCUtility.setupDBConnection();
	JDBCUtility.runQuery("select * from public.actor");
	JDBCUtility.returnResult();
	JDBCUtility.closeDBConnection();
		
		
    // 1. Important classes of JDBC
	  //1. Connection Class - connects to the DB using URL ( host:port database name, username, pass) 
	  //2. Statement Class - execute the query
	  //3. ResultSet - store the output of the query 
      //4. DriverManager - will be used for connection to DB driver
		
	}

}
