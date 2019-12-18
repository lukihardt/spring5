package sopo.cn.spring5.service;

import sopo.cn.spring5.dao.AccountDao;

public class AccountServiceImpl implements AccountService{
	@SuppressWarnings("unused")
	private AccountDao accountDao;
	public AccountServiceImpl(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}
	
}
