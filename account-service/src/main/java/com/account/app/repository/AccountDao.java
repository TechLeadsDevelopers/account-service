package com.account.app.repository;

import java.util.List;

import com.account.app.model.Account;

public interface AccountDao {
	public int save(Account account) throws Exception;

	public Account findById(Long id) throws Exception;

	public Account findByMaxId() throws Exception;

	public List<Account> findAll() throws Exception;

	public Account updateById(Long id, Account account) throws Exception;

	public int deleteById(Long id) throws Exception;

}
