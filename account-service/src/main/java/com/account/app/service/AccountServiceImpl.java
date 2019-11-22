package com.account.app.service;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findByMaxId() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateById(Long id, Account account) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
