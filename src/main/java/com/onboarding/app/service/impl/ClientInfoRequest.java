/**
 * 
 */
package com.onboarding.app.service.impl;

/**
 * @author uhase
 *
 */
public class ClientInfoRequest {
	
	/**
	 * @param clientName
	 * @param redirectUrl
	 * @param clientContact
	 * @param scope
	 * @param clientOrg
	 * @param clientId
	 */
	public ClientInfoRequest(String clientName, String redirectUrl, String clientContact, String scope,
			String clientOrg, String clientId) {
		super();
		this.clientName = clientName;
		this.redirectUrl = redirectUrl;
		this.clientContact = clientContact;
		this.scope = scope;
		this.clientOrg = clientOrg;
		this.clientId = clientId;
	}

	private String clientName;
	
	private String redirectUrl;
	
	private String clientContact;
	
	private String scope;
	
	private String clientOrg;
	
	private String clientId;

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
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
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

}
