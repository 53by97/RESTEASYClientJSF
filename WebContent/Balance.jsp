<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<f:view>
		<h:form id="balanceform">
			<h:outputText value="username" />
			<h:inputText id="username" value="#{requestBean.username}" maxlength="45" />
			<br>
			<br>
			<h:commandButton id="balance" value="Get Balance" action="#{requestBean.getBalance}"></h:commandButton>
		</h:form>
		
		<c:if test="${not empty requestBean.message}">
			<h:outputText value="#{requestBean.message}" />
		</c:if>
	</f:view>
</body>
</html>