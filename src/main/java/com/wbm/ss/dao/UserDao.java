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
 * com.wbm.ss.dao.UserDao
 *
 * workspace - spring-security
 */

package com.wbm.ss.dao;

import com.wbm.ss.domain.DbUser;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangBangMing on 2015/12/30.
 */
public class UserDao {

	protected static Logger logger = Logger.getLogger("dao");

	public DbUser findUser(String username){
		List<DbUser> users = getDataBase();
		for (DbUser user : users){
			if(user.getUsername().equals(username)){
				logger.debug("User Found");
				return user;
			}
		}
		logger.error("User Does Not Esxit!");
		throw new RuntimeException("User Does Not Esxit!");
	}

	public static List<DbUser> getDataBase(){
		List<DbUser> list = new ArrayList<>();
		DbUser user = null;
		user = new DbUser();
		user.setUsername("admin");
		user.setPassword("21232f297a57a5a743894a0e4a801fc3");
		user.setAccess(1);
		list.add(user);

		user = new DbUser();
		user.setUsername("user");
		user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
		user.setAccess(2);
		list.add(user);
		return list;
	}
}
