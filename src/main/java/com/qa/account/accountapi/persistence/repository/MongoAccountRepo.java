package com.qa.account.accountapi.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.account.accountapi.persistence.domain.SentAccount;

@Repository
public interface MongoAccountRepo extends MongoRepository<SentAccount, Long> {

}