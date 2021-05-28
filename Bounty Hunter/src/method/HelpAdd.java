package method;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.Infor;
import util.JDBC_link;
import iterfaces.AddItf;

public class HelpAdd implements AddItf{		//带跑信息增添
	JDBC_link getcon = new JDBC_link();
	Statement hsql=null;
	Connection con;
	@Override
	public int add(Infor infor) {
		// TODO Auto-generated method stub
		int k = 0;
		con = getcon.openOrcl();
		try {
			hsql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "insert into HELPGET values('"+infor.getTitleString()+"',"+infor.getCostInt()+",'"
		+infor.getPlaceGetString()+"','"+infor.getPlaceStirng()+"','"+infor.getTimeString()+"','"+infor.getPhoneString()+"','"
				+infor.getOtherString()+"',1)";
		try {
			k = hsql.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;
	}

}
