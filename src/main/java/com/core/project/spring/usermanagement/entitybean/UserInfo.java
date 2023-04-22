package com.core.project.spring.usermanagement.entitybean;

import java.io.Serializable;
import java.sql.Date;

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
	@Column(name = "userid")
	Integer userid;

	@Column(name = "name")
	String name;

	@Column(name = "age")
	Integer age;
	
	@Column(name = "gender")
	String gender;
	
	@Column(name = "email")
	String email;

	@Column(name = "mobile")
	Long mobile;
	
	@Column(name = "createdate")
	Date createdate;
	
	@Column(name = "modidate")
	Date modidate;
	
}
