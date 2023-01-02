<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário de cadastro de empresas</title>
</head>
<body>
<c:url value="/entrada" var="linkServlet"/>
<form action="${linkServlet}" method="post"> 
<center><br><br><br><br><br><br><br>
<font size="4">
Login: <input type="text" name="login"/><br>
 
Senha: <input type="password" name="senha"/><br>
<input type="submit"/></font>
<input type="hidden" name="acao" value="Login">
</center>
</form>
</body>
</html>