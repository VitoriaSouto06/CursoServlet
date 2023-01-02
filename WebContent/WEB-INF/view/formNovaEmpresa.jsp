<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário de cadastro de empresas</title>
</head>
<body>
<c:import url="logout-parcial.jsp"/>
<c:url value="/entrada" var="linkServlet"/>
<form action="${linkServlet}" method="post"> 
<center><br><br><br><br><br><br><br>
<font size="4">
Nome: <input type="text" name="nome"/><br>
 
DataAbertura: <input type="text" name="data"/><br>
<input type="submit"/></font>
<input type="hidden" name="acao" value="NovaEmpresa">
</center>
</form>
</body>
</html>