package com.epam.training.library.daodb.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.epam.training.library.daodb.AccountsDao;
import com.epam.training.library.datamodel.Accounts;

@Repository
public class AccountDaoImpl implements AccountsDao{
	@Inject
	private JdbcTemplate jdbcTemplate;

	@Override
    public Accounts getAccounts(Integer id) {
		 return jdbcTemplate.queryForObject(
	                "select * from accounts where id = ?",
	                new Object[] { id }, new BeanPropertyRowMapper<Accounts>(
	                        Accounts.class));
    }

	@Override
	public void saveAccounts(Accounts entity) {
		

		 final String INSERT_SQL = "insert into accounts (account_id,Customer_id,accounts_name,current_ballance,account_mail) values(?)";

	        KeyHolder keyHolder = new GeneratedKeyHolder();
	        jdbcTemplate.update(new PreparedStatementCreator() {
	            @Override
	            public PreparedStatement createPreparedStatement(
	                    Connection connection) throws SQLException {
	                PreparedStatement ps = connection.prepareStatement(
	                        INSERT_SQL, new String[] { "id" });
	                ps.setString(1, entity.getAccountId());
	                return ps;
	            }
	        }, keyHolder);

	        entity.setCustomerId(customerId);(keyHolder.getKey().intValue());

	        return entity.getAccountId()();
	}

	@Override
	public void deleteAccounts(Integer id) {
		 return jdbcTemplate.queryForObject(
	                "delete  from accounts where id = ?",
	                new Object[] { id }, new BeanPropertyRowMapper<Accounts>(
	                        Accounts.class));
		
	}

	@Override
	public List<Accounts> getAllAccounts() {
		List<Accounts> rs = jdbcTemplate.query("select * from accounts ",
                new BeanPropertyRowMapper<Accounts>(Accounts.class));
        return rs;
	}

}
