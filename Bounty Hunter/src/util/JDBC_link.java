package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_link {
	public Connection openOrcl()
	{
		Connection con = null;
		try {
			
			//加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//注册驱动
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			 //连接数据库
			//ORCL:数据库名字
		        String url="jdbc:oracle:thin:@localhost:1521:orcl" ;
		        String UserName="system";
		        String UserPass="123456";
		       con= DriverManager.getConnection(url,UserName,UserPass);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return con;
	}
}
