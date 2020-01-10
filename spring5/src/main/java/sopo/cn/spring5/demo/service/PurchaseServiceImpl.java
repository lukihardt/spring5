package sopo.cn.spring5.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sopo.cn.spring5.demo.dao.ClothesDao;
import sopo.cn.spring5.demo.dao.UserDao2;

@Service
public class PurchaseServiceImpl implements PurchaseService{

	@Autowired
	private ClothesDao clothesDaoImpl; 
	
	@Autowired
	private UserDao2 userDao2Impl;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, timeout = 10 /*rollbackFor = RuntimeException.class*/)
	@Override
	public void purchaseClothe(Integer uid, Integer cid, Integer count) {
		// TODO Auto-generated method stub
		// 1, 通过衣服ID获取到衣服的单价，计算出购买衣服的总金额
		Double sumAmount = clothesDaoImpl.getPrice( cid) * count;
		// 2, 从衣服库存数中减去用户购买的数量
		clothesDaoImpl.updateInventory( cid, count);
		// 3, 从用户的余额中扣除购买衣服的总金额
		userDao2Impl.updateBalance( uid, sumAmount);
	}

}
