<%@page import="vilt.persistence.DbSeeder"%>
<%@ 
page import="vilt.*"
%>
<html>
<body>
<h2>Hello World!</h2>
<%
		DbSeeder hola = new DbSeeder(clientRepository);
		
		hola.log();
	%>
</body>
</html>
