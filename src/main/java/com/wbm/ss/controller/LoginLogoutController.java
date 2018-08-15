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
 * com.wbm.ss.controller.LoginLogoutController
 *
 * workspace - spring-security
 */

package com.wbm.ss.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WangBangMing on 2015/12/30.
 */
@RequestMapping("auth")
@Controller
public class LoginLogoutController {
	protected static Logger logger = Logger.getLogger("controller");

	/**
	 * 指向登录页面
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(
			@RequestParam(value = "error", required = false) boolean error,
			ModelMap model) {

		logger.debug("Received request to show login page");

		if (error == true) {
			// Assign an error message
			model.put("error",
					"You have entered an invalid username or password!");
		} else {
			model.put("error", "");
		}
		return "loginpage";

	}

	/**
	 * 指定无访问额权限页面
	 *
	 * @return
	 */
	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	public String getDeniedPage() {

		logger.debug("Received request to show denied page");

		return "deniedpage";

	}
}
