package admin.login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import admin.login.bean.UserBean;

public class LoginDao {

	private String dburl = "jdbc:mysql://localhost:3306/arbaaz1?autoReconnect=true&useSSL=false";
	private String dbUsername = "root";
	private String dbPassword = "Arbaazashroya@0334";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getConnection() throws SQLException {

		Connection conn = DriverManager.getConnection(dburl, dbUsername, dbPassword);
		return conn;
	}

	public boolean validate(UserBean beanObject) throws SQLException {
		loadDriver(dbDriver);
		Connection conn = getConnection();
		boolean status = false;
		String sql = "select * from userdetails where userid = ? and password = ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, beanObject.getUsername());
			pstmt.setString(2, beanObject.getPassword());

			ResultSet set = pstmt.executeQuery();

			status = set.next();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}

	public UserBean getUserDetails(UserBean beanObject) throws SQLException {
		loadDriver(dbDriver);
		Connection conn = getConnection();
		
		String sql = "select firstname, lastname, age, city from userdetails where userid = ? and password = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, beanObject.getUsername());
		pstmt.setString(2, beanObject.getPassword());

		ResultSet set = pstmt.executeQuery();

		while (set.next()) {
			String firstName = set.getString(1);
			String lastName = set.getString(2);
			int age = set.getInt(3);
			String city = set.getString(4);

			beanObject.setFirstName(firstName);
			beanObject.setLastName(lastName);
			beanObject.setAge(age);
			beanObject.setCity(city);

		}
		return beanObject;

	}
	
	public int EnterNewUser(UserBean newUser) throws SQLException
	{
		String username = newUser.getUsername();
		String password = newUser.getPassword();
		String fistName = newUser.getFirstName();
		String lastName = newUser.getLastName();
		int age = newUser.getAge();
		String city = newUser.getCity();
		
		loadDriver(dbDriver);
		Connection conn = getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("insert into userdetails values(?,?,?,?,?,?)");
		pstmt.setString(1, username);
		pstmt.setString(2,password);
		pstmt.setString(3,fistName);
		pstmt.setString(4, lastName);
		pstmt.setInt(5, age);
		pstmt.setString(6, city);
		
		int rowCount = pstmt.executeUpdate();
		System.out.println("Rows Affected: "+rowCount);
		
		return rowCount;
		
	}
}
