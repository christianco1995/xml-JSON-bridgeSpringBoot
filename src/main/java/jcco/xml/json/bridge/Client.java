/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jcco.xml.json.bridge;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 *
 * @author JCCO
 */
public class Client {
	@NotBlank(message = "ID is mandatory")
	private String id;
	
	@NotBlank(message = "Name cannot be blank")
	@Size(min = 2, max = 100, message = "Name must have between 2 and 100 characters")
	private String name;
	
	@NotBlank(message = "Account type cannot be blank")
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
