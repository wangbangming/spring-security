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
 * com.wbm.ss.controller.MainController
 *
 * workspace - spring-security
 */

package com.wbm.ss.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by WangBangMing on 2015/12/30.
 */
@Controller
@RequestMapping("/main")
public class MainController {
	protected static Logger logger = Logger.getLogger("controller");

	/**
	 * 跳转到commonpage页面
	 *
	 * @return
	 */
	@RequestMapping(value = "/common", method = RequestMethod.GET)
	public String getCommonPage() {
		logger.debug("Received request to show common page");
		return "commonpage";
	}

	/**
	 * 跳转到adminpage页面
	 *
	 * @return
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getAadminPage() {
		logger.debug("Received request to show admin page");
		return "adminpage";

	}
}
