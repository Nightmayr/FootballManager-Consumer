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

	@JmsListener(destination = "${activemq.queue.name}", containerFactory = "${container.factory.name}")
	public void receiveMessage(SentAccount sentAccount) {
		repo.save(sentAccount);
	}
}
