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
  ~ D:/TrafficSafety/spring-security/src/main/webapp/WEB-INF/jsp/loginpage.jsp
  ~
  ~ workspace - spring-security
  --%>

<%--
  Created by IntelliJ IDEA.
  User: WangBangMing
  Date: 2015/12/30
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>

<h1>Login</h1>

<div id="login-error"><font color="red">${error}</font></div>

<form action="../j_spring_security_check" method="post">

  <p>
    <label for="j_username">Username</label> <input id="j_username"
                                                    name="j_username" type="text" />
  </p>

  <p>
    <label for="j_password">Password</label> <input id="j_password"
                                                    name="j_password" type="password" />
  </p>

  <input type="submit" value="Login" />

</form>

</body>
</html>
