package sopo.cn.spring5.demo.dao;

public interface UserDao2 {
	public void updateBalance( Integer userid, double amount);
	public Double getBalance( Integer id);
}
