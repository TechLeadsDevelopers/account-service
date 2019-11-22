package com.account.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.account.app.commons.DBQueries;
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
		try {
			Account account = new Account();
			SqlParameterSource paramSource = new MapSqlParameterSource()

					.addValue("id", id);

			NamedParameterJdbcTemplate.query(DBQueries.SELECT_ACCNT_BY_ID, paramSource,
					new ResultSetExtractor<Account>() {

						@Override
						public Account extractData(ResultSet rs) throws SQLException, DataAccessException {
							while (rs.next()) {
								account.setId(rs.getLong("ID"));
								account.setName(rs.getString("NAME"));
								account.setDescription(rs.getString("DESCRIPTION"));
								account.setStatus(rs.getString("STATUS"));
								account.setCreatedate(rs.getTimestamp("CREATEDATE"));
								account.setCreatedUser(rs.getString("CREATEDUSER"));
								account.setLastmodified(rs.getTimestamp("LASTMODIFIED"));
								account.setUpdatedUser(rs.getString("UPDATEDUSER"));

							}
							return account;
						}
					});
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
