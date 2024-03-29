package com.account.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.app.model.Account;
import com.account.app.repository.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;

	@Override
	public Account save(Account account) throws Exception {
		try {
			int count = accountDao.save(account);
			if (count > 0) {
				return findById(account.getId());
			}
			return new Account();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Account findById(Long id) throws Exception {
		try {
			Account account = accountDao.findById(id);
			return account;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Account findByMaxId() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAll() throws Exception {
		try {
			List<Account> accounts = accountDao.findAll();
			return accounts;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Account updateById(Long id, Account account) throws Exception {
		try {
			int count = accountDao.updateById(id, account);
			if (count > 0) {
				return findById(id);
			}
			return new Account();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Account> deleteById(Long id) throws Exception {
		try {
			int count = accountDao.deleteById(id);
			return findAll();
		} catch (Exception e) {
			throw e;
		}
	}

}
