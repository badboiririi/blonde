package iterfaces;

import java.sql.ResultSet;


public interface SearchItf {//搜索信息接口（点击标题超链接时自动调用查询本条信息的详细信息）
	public ResultSet search(int no,String type);
}
