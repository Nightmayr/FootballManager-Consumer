package com.qa.account.accountapi.persistence.domain;

public class SentAccount {
	
	private Long accountId;
	
	private String fullName;
	
	private String email;
	
	private Boolean playing;
	
	public SentAccount() {
		
	}

	public SentAccount(Long accountId, String fullName, String email, Boolean playing) {
		super();
		this.accountId = accountId;
		this.fullName = fullName;
		this.email = email;
		this.playing = playing;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getPlaying() {
		return playing;
	}

	public void setPlaying(Boolean playing) {
		this.playing = playing;
	}
	
	
}
