package sopo.cn.spring5.demo.dao;

public interface ClothesDao {
	public double getPrice( Integer id);
	public Integer getInventory( Integer id);
	public void updateInventory( Integer clothid, Integer amount);
}
