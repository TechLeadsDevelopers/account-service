package com.account.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.account.app.model.Account;
import com.account.app.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
	public ResponseEntity<Account> findById(@PathVariable("id") Long id) {
		Account account = new Account();
		try {
			if (!StringUtils.isEmpty(account.getId())) {
				account = accountService.findById(id);
				return new ResponseEntity<Account>(account, HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Account>(account, HttpStatus.NOT_FOUND);

	}

	@RequestMapping(value = "/accounts", method = RequestMethod.POST)
	public ResponseEntity<Account> saveAccount(@RequestBody Account account) {
		try {

			account = accountService.save(account);
			if (!StringUtils.isEmpty(account.getId())) {
				return new ResponseEntity<Account>(account, HttpStatus.CREATED);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Account>(account, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Account>(account, HttpStatus.BAD_REQUEST);
	}

}
