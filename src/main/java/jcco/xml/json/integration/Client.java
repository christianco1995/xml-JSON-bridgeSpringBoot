/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jcco.xml.json.integration;

/**
 *
 * @author JCCO
 */
public class Client {
	private String id;
	private String name;
	private String accountType;
	
	public Client() {};

	public Client(String id, String name, String accountType) {
		this.id = id;
		this.name = name;
		this.accountType = accountType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
