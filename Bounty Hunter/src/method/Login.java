package method;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBC_link;

public class Login {
	JDBC_link getcon = new JDBC_link();
	Connection con = null;
	Statement lsql = null;
	ResultSet lrs = null;
	public int getlog(String name,String pass) throws SQLException{
		con = getcon.openOrcl();
		lsql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		lrs = lsql.executeQuery("SELECT UPASS FROM USERS WHERE UNAME='"+name+"'");
		String upass = null;
		while(lrs.next()){
			upass = lrs.getString("UPASS");
		}
		if(upass==null || upass.equals("")){
			return 0;
		}
		else if(upass.equals(pass)){
			return 1;
		}
		else
			return 2;
	}
}
