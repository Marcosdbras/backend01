<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import = "com.avaliacao.*" %>


<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Avaliação para vaga de programador</title>
</head>
<body>
	Avaliação para vaga de programador ISO-8859-1



   <%	

   ConexaoDB conexao = new ConexaoDB();

   if (conexao.acessoDB()){

   %>


	   <h1>Conexão realizada com sucesso</h1>



       <%     


       conexao.fecharDB();


   } else { 


        %>


        <h1>Houve um erro ao tentar fazer a conexão</h1>


       <%  
   
   }

       %>

</body>
</html>