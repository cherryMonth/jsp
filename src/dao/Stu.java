package dao;

import java.util.List;
import java.sql.*;

public class Stu implements StuDao{
	
	static String url = "jdbc:hsqldb:hsql://localhost";
	
	static String driver = "org.hsqldb.jdbc.JDBCDriver";
	
	static String user = "SA";
	
	static String password = "";
	
	static Connection conn = null;
	
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public boolean check(String user) throws Exception {
		String sql = "select * from test;";
		try(PreparedStatement ptmt = conn.prepareStatement(sql)){
			//ptmt.setString(1, user);			
			try(ResultSet rs = ptmt.executeQuery()){
				if(rs.next())
					{System.out.println(rs.getString("USERNAME"));
					return true;
					}
			}
		}
		return false;
	}

	@Override
	public List getStuALl() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception {
		new Stu().check("zhangshan");
	}
	
}
