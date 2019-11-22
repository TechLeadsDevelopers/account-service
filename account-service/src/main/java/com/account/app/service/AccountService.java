package com.account.app.service;

import java.util.List;

import com.account.app.model.Account;

public interface AccountService {
	public Account save(Account account) throws Exception;

	public Account findById(Long id) throws Exception;

	public Account findByMaxId() throws Exception;

	public List<Account> findAll() throws Exception;

	public Account updateById(Long id, Account account) throws Exception;

	public List<Account> deleteById(Long id) throws Exception;

}
