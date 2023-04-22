package com.core.project.spring.usermanagement.entitybean;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USERWORKPROFILE")
public class UserWorkProfile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "workid")
	Integer workid;

	@Column(name = "userid")
	Integer userid;
	
	@Column(name = "profileGroup")
	String profileGroup;
	
	@Column(name = "designation")
	String designation;

	@Column(name = "DOJ")
	Date DOJ;
	
	@Column(name = "createdate")
	Date createdate;
	
	@Column(name = "modidate")
	Date modidate;

}
