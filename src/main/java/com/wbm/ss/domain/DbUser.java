/*
 * Licensed to SAICMotor,Inc. under the terms of the SAICMotor
 * Software License version 1.0.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date             Author      Version        Comments
 * 2015-12-30       汪邦鸣         1.0            Initial Version
 *
 * com.wbm.ss.domain.DbUser
 *
 * workspace - spring-security
 */

package com.wbm.ss.domain;

/**
 * Created by WangBangMing on 2015/12/30.
 */
public class DbUser {
	private String username;
	private String password;
	private Integer access;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAccess() {
		return access;
	}

	public void setAccess(Integer access) {
		this.access = access;
	}
}
