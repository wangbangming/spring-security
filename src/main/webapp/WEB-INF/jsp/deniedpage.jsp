<%--
  ~ Licensed to SAICMotor,Inc. under the terms of the SAICMotor
  ~ Software License version 1.0.
  ~
  ~ See the NOTICE file distributed with this work for additional
  ~ information regarding copyright ownership.
  ~ ----------------------------------------------------------------------------
  ~ Date             Author      Version        Comments
  ~ 2015-12-30       汪邦鸣         1.0            Initial Version
  ~
  ~ D:/TrafficSafety/spring-security/src/main/webapp/WEB-INF/jsp/deniedpage.jsp
  ~
  ~ workspace - spring-security
  --%>

<%--
  Created by IntelliJ IDEA.
  User: WangBangMing
  Date: 2015/12/30
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
<h1>你的权限不够!</h1>
<p>只有拥有Admin权限才能访问!</p>
<a href="/spring-security/auth/login">退出登录</a>
</body>
</html>
