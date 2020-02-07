package com.cts.training.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
//The bean name will be pojo class name starts with small letter(userEntity)----> as object
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -804893219860638008L;
	private int id;
	private String username;
	private String password;
	private Set<String> email;
	private long phone;
	private boolean enabled;
	private AddressEntity address;

	public UserEntity(int id, String username, String password, Set<String> email, long phone, boolean enabled,
			AddressEntity address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.address = address;
	}

	public UserEntity() {

	}

	@Override
	public String toString() {
		return "[id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", enabled=" + enabled + ", address=" + address + "]";
	}

	public UserEntity(int id, String username, String password, Set<String> email, long phone, boolean enabled) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getEmail() {
		return email;
	}

	public void setEmail(Set<String> email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
