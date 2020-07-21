package com.neusoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbUtil {
	private static String dbUrl="jdbc:mysql://localhost:3306/exam_system?";
	
	private static String dbUserName="root";
	
	private static String dbPassword="516516";//数据库密码

	private static String jdbcName="com.mysql.jdbc.Driver";

	public static Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		return con;
	}

	public static void closeCon(Connection con) throws Exception
	{
		if(con != null)
			con.close();
	}
	public static void cliseCon(Connection con,Statement sta)throws Exception{
		if(sta != null)
			sta.close();
		if(con != null)
			con.close();
		
	}
}
