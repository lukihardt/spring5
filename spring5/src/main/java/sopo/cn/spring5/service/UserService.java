package sopo.cn.spring5.service;

import org.springframework.stereotype.Service;

import sopo.cn.spring5.dao.BaseDao;
import sopo.cn.spring5.model.User;
@Service
public class UserService extends BaseService<User> {
	User user = new User();
	BaseDao<User> baseDao = new BaseDao<User>();
	public void useDaoAdd() {
		baseDao.add(user);
	}
}
