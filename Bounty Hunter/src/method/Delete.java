package method;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBC_link;
import iterfaces.DeleteItf;

public class Delete implements DeleteItf{//删除已经不需要人的信息，通过检测state实现
	JDBC_link getcon = new JDBC_link();
	Statement dsql=null;
	Connection con;
	@Override
	public int delete(int no,String type) {
		// TODO Auto-generated method stub
		int k=0;
		String str = "delete from "+type+"where no = "+no;
		con = getcon.openOrcl();
		try {
			dsql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			k = dsql.executeUpdate(str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;
	}

}
