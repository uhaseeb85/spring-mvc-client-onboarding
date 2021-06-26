/**
 * 
 */
package com.onboarding.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author uhase
 *
 */
@Entity
public class Client {

	/**
	 * @param id
	 * @param clientName
	 * @param redirectUrl
	 * @param clientContact
	 * @param scope
	 * @param clientOrg
	 * @param clientSecret
	 */
	public Client(String id, String clientName, String redirectUrl, String clientContact, String scope,
			String clientOrg, String clientSecret) {
		super();
		this.id = id;
		this.clientName = clientName;
		this.redirectUrl = redirectUrl;
		this.clientContact = clientContact;
		this.scope = scope;
		this.clientOrg = clientOrg;
		this.clientSecret = clientSecret;
	}

	/**
	 * 
	 */
	public Client() {
		super();
	}

	@Column(name = "id", nullable = false)
	private String id;
	
	@Column(name = "client_name", nullable = false)
	private String clientName;
	
	@Column(name = "redirect_url", nullable = false)
	private String redirectUrl;
	
	@Column(name = "client_contact", nullable = false)
	private String clientContact;
	
	@Column(name = "scope", nullable = false)
	private String scope;
	
	@Column(name = "client_org", nullable = false)
	private String clientOrg;
	
	@Column(name = "client_secret", nullable = false)
	private String clientSecret;

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the redirectUrl
	 */
	public String getRedirectUrl() {
		return redirectUrl;
	}

	/**
	 * @param redirectUrl the redirectUrl to set
	 */
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	/**
	 * @return the clientContact
	 */
	public String getClientContact() {
		return clientContact;
	}

	/**
	 * @param clientContact the clientContact to set
	 */
	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}

	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	/**
	 * @return the id
	 */
	@Id
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the clientOrg
	 */
	public String getClientOrg() {
		return clientOrg;
	}

	/**
	 * @param clientOrg the clientOrg to set
	 */
	public void setClientOrg(String clientOrg) {
		this.clientOrg = clientOrg;
	}

	/**
	 * @return the clientSecret
	 */
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * @param clientSecret the clientSecret to set
	 */
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

}
