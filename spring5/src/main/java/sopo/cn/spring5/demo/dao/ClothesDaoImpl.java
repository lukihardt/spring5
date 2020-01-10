package sopo.cn.spring5.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClothesDaoImpl implements ClothesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public double getPrice(Integer id) {
		// TODO Auto-generated method stub
		String sql = "SELECT `price` FROM `clothes` WHERE id = ?;";
		return jdbcTemplate.queryForObject(sql, Double.class, id);
	}

	@Override
	public Integer getInventory(Integer id) {
		// TODO Auto-generated method stub
		String sql = "SELECT `inventory` FROM `clothes` WHERE id = ?;";
		return jdbcTemplate.queryForObject(sql, Integer.class, id);
	}

	@Override
	public void updateInventory(Integer clothid, Integer amount) {
		// TODO Auto-generated method stub
		if (getInventory(clothid) < amount) {
			throw new RuntimeException("衣服库存不足!");
		}
		String sql = "UPDATE clothes SET inventory = inventory - ? WHERE id = ?;";
		jdbcTemplate.update( sql, amount, clothid);
	}

}
