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
 * com.wbm.ss.service.CustomUserDetailsService
 *
 * workspace - spring-security
 */

package com.wbm.ss.service;

import com.wbm.ss.dao.UserDao;
import com.wbm.ss.domain.DbUser;
import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by WangBangMing on 2015/12/30.
 */

public class CustomUserDetailsService implements UserDetailsService{
	protected static Logger logger = Logger.getLogger("service");
	private UserDao userDao = new UserDao();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails user = null;

		try {
			DbUser dbUser = userDao.findUser(username);
			user = new User(dbUser.getUsername(), dbUser.getPassword().toLowerCase(), true, true, true, true,
					getAuthorities(dbUser.getAccess()));
		}catch (Exception e){
			logger.error("Error in retrieving user");
			throw new UsernameNotFoundException("Error in retrieving user");
		}
		return user;
	}

	public Collection<GrantedAuthority> getAuthorities(Integer access){
		List<GrantedAuthority> authList = new ArrayList<>();

		// 所有的用户默认拥有ROLE_USER权限
		logger.debug("Grant ROLE_USER to this user");
		authList.add(new GrantedAuthorityImpl("ROLE_USER"));

		// 如果参数access为1.则拥有ROLE_ADMIN权限
		if (access.compareTo(1) == 0) {
			logger.debug("Grant ROLE_ADMIN to this user");
			authList.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
		}
		return authList;
	}
}
