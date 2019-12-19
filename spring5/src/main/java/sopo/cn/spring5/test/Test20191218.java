package sopo.cn.spring5.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopo.cn.spring5.model.Account;
import sopo.cn.spring5.model.User;

public class Test20191218 {

	@Test
	public void test1() {
		try( ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")){
			Account account = ctx.getBean(Account.class);
			System.out.println(account.toString());
		}
	}
	
	@Test
	public void test2() {
		try( ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")){
			PropertiesDemo demo = ctx.getBean(PropertiesDemo.class);
			System.out.println(demo.toString());
		}
	}
	
	@Test
	public void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user1 = ctx.getBean(User.class);
		User user2 = ctx.getBean(User.class);
		System.out.println(user1 == user2);
		ctx.close();
	}
	
	@Test
	public void testC3p0Bean() throws SQLException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DataSource) ctx.getBean("c3p0");
		Connection connection = dataSource.getConnection();
		
		//用用connection
		String sql = "select * from locations;";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet rs = preparedStatement.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		LinkedHashMap< String, Object> linkedHashMap = new LinkedHashMap<>();
		while(rs.next()) {
			for( int i = 1; i <= rsmd.getColumnCount(); i++) {
				String columnName = rsmd.getColumnLabel(i);
				Object object = rs.getObject(columnName);
				linkedHashMap.put( columnName, object);
			}
			System.out.println(linkedHashMap);
		}
		
		ctx.close();
	}
}
