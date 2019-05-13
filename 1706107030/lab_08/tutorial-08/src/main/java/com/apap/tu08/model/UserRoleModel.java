package com.apap.tu08.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("unused")
@Entity
@Table(name="user_role")
public class UserRoleModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size (max=50)
	@Column (name="username", nullable=false)
	private String username;
	
	@NotNull
	@Lob
	@Column (name="password", nullable=false)
	private String password;
	
	@NotNull
	@Size (max=50)
	@Column (name="role", nullable=false)
	private String role;

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(Object object) {
		// TODO Auto-generated method stub
		
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Object id2) {
		// TODO Auto-generated method stub
		
	}

	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUsername(Object username2) {
		// TODO Auto-generated method stub
		
	}

	public Object getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRole(Object role2) {
		// TODO Auto-generated method stub
		
	}

}
