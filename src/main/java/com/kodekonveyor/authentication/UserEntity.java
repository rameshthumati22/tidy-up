package com.kodekonveyor.authentication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.kodekonveyor.webapp.ExcludeFromCodeCoverage;

import lombok.Data;

@Entity
@Data
@ExcludeFromCodeCoverage("no code")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "username")
	private String login;
	@Column(name = "auth0id")
	private String auth0id;

}
