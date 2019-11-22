package com.account.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.account.app.model.Account;

@Repository
public class AccountDaoImpl implements AccountDao {
	@Autowired
	private NamedParameterJdbcTemplate NamedParameterJdbcTemplate;

	@Override
	public int save(Account account) throws Exception {
		// TODO Auto-generated method stub
		return 0;
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
	public int deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
