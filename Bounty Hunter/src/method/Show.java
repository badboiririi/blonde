package method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.JDBC_link;

public class Show{
	JDBC_link getcon = new JDBC_link();
	Statement ssql = null;
	Connection con;
	ResultSet srs=null;
	@SuppressWarnings("rawtypes")
	public List show(String table) {
		// TODO Auto-generated method stub
		List<String>title = new ArrayList<String>();
		String sql = "select title from "+table;
		con = getcon.openOrcl();
		try {
			ssql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			srs = ssql.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(srs.next()){
				title.add(srs.getString("title"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return title;
	}
}
