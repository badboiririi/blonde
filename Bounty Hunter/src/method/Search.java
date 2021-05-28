package method;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBC_link;
import iterfaces.SearchItf;

public class Search implements SearchItf{
	JDBC_link getcon = new JDBC_link();
	Connection con = null;
	Statement ssql = null;
	ResultSet srs = null;
	@Override
	public ResultSet search(int no, String type) {
		String sql = "select * from "+type+"where no = "+no;
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
		// TODO Auto-generated method stub
		return srs;
	}

}
