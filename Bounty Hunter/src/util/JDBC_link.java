package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_link {
	public Connection openOrcl()
	{
		Connection con = null;
		try {
			
			//��������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//ע������
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			 //�������ݿ�
			//ORCL:���ݿ�����
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
