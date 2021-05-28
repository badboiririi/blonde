package method;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBC_link;

public class Insert {
	JDBC_link getcon = new JDBC_link();
	Connection con = null;
	Statement isql = null;
	ResultSet irs = null;
	public int getinsert(String name,String pass) throws SQLException{
		con = getcon.openOrcl();
		isql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		irs = isql.executeQuery("SELECT UPASS FROM USERS WHERE UNAME='"+name+"'");
		String upass = null;
		while(irs.next()){
			upass = irs.getString("UPASS");
		}
		if(upass==null || upass.equals("")){
			int i = isql.executeUpdate("INSERT INTO USERS VALUES(myseqsy.nextval,'"+name+"','"+pass+"')");
			return i;
		}
		else
			return 3;
	}
	
}
