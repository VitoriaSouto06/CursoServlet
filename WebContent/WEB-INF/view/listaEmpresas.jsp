<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@page import="java.util.List,modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas Cadastradas</title>
</head>
<body>
<br>
<br>
<br>
<c:import url="logout-parcial.jsp"/>

    <c:if test="${not empty empresa}">
	Empresa ${empresa} -  criada
</c:if>	
    
    Lista de Empresas<br/>
    <ul>
    Usuario:     ${usuarioLogado.login} 
<c:forEach  items="${empresas}" var="empresa">
<li>
${empresa.nome} - <fmt:formatDate value= "${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> <a href="/projetoservlet/entrada?acao=RemoveEmpresa&id=${empresa.id}">remover</a>
<a href="/projetoservlet/entrada?acao=MostraEmpresas&id=${empresa.id}">editar</a>
</li>
</c:forEach>
<c:if test="${empty empresas}">

A lista de empresas está vazia.</c:if>



</ul>


</body>
</html>