package com.stand.spring.model;

public class Email {
	private Integer id;

	private String host;

	private String protocol;

	private String sendemailname;

	private String sendemailpassword;

	private String reciveemailname;

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host == null ? null : host.trim();
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol == null ? null : protocol.trim();
	}

	public String getSendemailname() {
		return sendemailname;
	}

	public void setSendemailname(String sendemailname) {
		this.sendemailname = sendemailname == null ? null : sendemailname.trim();
	}

	public String getSendemailpassword() {
		return sendemailpassword;
	}

	public void setSendemailpassword(String sendemailpassword) {
		this.sendemailpassword = sendemailpassword == null ? null : sendemailpassword.trim();
	}

	public String getReciveemailname() {
		return reciveemailname;
	}

	public void setReciveemailname(String reciveemailname) {
		this.reciveemailname = reciveemailname == null ? null : reciveemailname.trim();
	}
}