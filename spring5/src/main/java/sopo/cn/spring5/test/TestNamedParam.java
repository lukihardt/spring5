package sopo.cn.spring5.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import sopo.cn.spring5.model.User;

public class TestNamedParam {
	@Test
	public void test() {
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		NamedParameterJdbcTemplate jdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
		String sql = "INSERT INTO users(username, `password`) VALUES( :us, :ps);";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put( "us", "james");
		map.put( "ps", "070707");
		
		jdbcTemplate.update( sql, map);
		
		context.close();
	}
	@Test
	public void test2() {
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
		String sql = "INSERT INTO users(username, `password`) VALUES( :username, :password);";
		
		User user = new User();
		user.setUsername("kobe");
		user.setPassword("944555");
		
		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(user);
		
		namedParameterJdbcTemplate.update(sql, parameterSource);
		context.close();
	}
}
