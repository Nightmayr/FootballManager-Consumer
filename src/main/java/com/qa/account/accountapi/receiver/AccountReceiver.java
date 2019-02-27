package com.qa.account.accountapi.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.account.accountapi.persistence.domain.SentAccount;
import com.qa.account.accountapi.persistence.repository.MongoAccountRepo;

@Component
public class AccountReceiver {

	@Autowired
	private MongoAccountRepo repo;

	private static Long accountId = 1L;


	@JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	public void receiveMessage(SentAccount sentAccount) {
		if(repo.count() < 1) {
			sentAccount.setAccountId(accountId);
		} else {
			sentAccount.setAccountId(repo.findTopByOrderByAccountIdDesc().getAccountId()+1);
		}
		repo.save(sentAccount);
	}
}