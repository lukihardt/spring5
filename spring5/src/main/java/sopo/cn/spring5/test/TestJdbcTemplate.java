package sopo.cn.spring5.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import sopo.cn.spring5.model.User;

public class TestJdbcTemplate {
	@Test
	public void testInsert() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);

		String sql = "INSERT INTO users(username, `password`) VALUES( ?, ?);";
		jdbcTemplate.update(sql, "hong", "12312");
		ctx.close();
	}

	@Test
	public void testDelete() {
		AbstractXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
		String sql = "DELETE FROM users WHERE username = ?;";
		jdbcTemplate.update(sql, "hong");
		ctx.close();
	}

	@Test
	public void testUpdate() {
		AbstractXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
		String sql = "UPDATE users SET `password` = ? WHERE username = ?;";
		jdbcTemplate.update(sql, "123456", "abc");
		ctx.close();
	}

	@Test
	public void testQueryOne() {
		AbstractXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
		String sql = "SELECT * FROM users WHERE username = ?;";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		User user = jdbcTemplate.queryForObject(sql, rowMapper, "abc");
		System.out.println(user);
		ctx.close();
	}

	@Test
	public void testQueryMany() {
		AbstractXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
		String sql = "SELECT * FROM users;";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);

		List<User> users = jdbcTemplate.query(sql, rowMapper);

		System.out.println(users);

		ctx.close();
	}

	@Test
	public void testQueryValue() {
		AbstractXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
		String sql = "SELECT COUNT(*) FROM users;";
		// 	RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>();
		
		Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(integer);
		
		ctx.close();
	}
	
	@Test
	public void testInsertBatch() {
		AbstractXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
		String sql = "INSERT INTO users(username, `password`) VALUES( ?, ?);";
		List<Object[]> batchArgs = new ArrayList<Object[]>();
		
		for( int i = 0; i < 10; i++) {
			batchArgs.add( new Object[] { String.valueOf(new Random().nextDouble()), ""+i+i+i+i+i+i});
		}
		
		jdbcTemplate.batchUpdate(sql, batchArgs);
		
		ctx.close();
	}
}
