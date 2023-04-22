package com.core.project.spring.usermanagement.entitybean;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USERINFO")
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	Integer userId;

	@Column(name = "name")
	String name;

	@Column(name = "age")
	Integer age;
	
	@Column(name = "email")
	String email;

	@Column(name = "mobile")
	Long mobile;
	
}
