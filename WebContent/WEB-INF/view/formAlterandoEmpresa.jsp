<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@page import="java.util.List,modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário de Alteração de Empresas</title>
</head>
<body>
<c:import url="logout-parcial.jsp"/>
<c:url value="/entrada" var="linkServlet"/>
<form action="${linkServlet}" method="post"> 
Nome: <input type="text" name="nome" value="${empresa.nome}"/>

 Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" />
<input type="hidden" name ="id" value="${empresa.id}">
<input type="hidden" name ="acao" value="AlteraEmpresa">
<input type="submit"/>

</form>
</body>
</html>