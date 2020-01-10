package sopo.cn.spring5.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao2Impl implements UserDao2 {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void updateBalance( Integer userid, double amount) {
		// TODO Auto-generated method stub
		if ( getBalance( userid) < amount) {
			throw new RuntimeException( "用户余额不足！");
		}
		String sql = "UPDATE buyers SET balance = balance - ? WHERE id = ?;";
		jdbcTemplate.update( sql, amount, userid);
	}

	@Override
	public Double getBalance( Integer id) {
		// TODO Auto-generated method stub
		String sql = "SELECT balance FROM buyers WHERE id = ?;";
		return jdbcTemplate.queryForObject( sql, Double.class, id);
	}

}
