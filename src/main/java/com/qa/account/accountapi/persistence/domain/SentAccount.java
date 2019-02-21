package com.qa.account.accountapi.persistence.domain;

public class SentAccount {

	private Long accountId;
	private String password;
	private String fullName;
	private String email;
	private Boolean playing;

	public SentAccount() {
		//Empty constructor
	}

	public SentAccount(Long accountId, String password, String fullName, String email, Boolean playing) {
		this.accountId = accountId;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.playing = playing;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
