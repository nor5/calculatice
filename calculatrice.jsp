<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
<meta charset="UTF-8">
<title>Calculatrice</title>
<link type="text/css" rel="stylesheet" href= "./calcul.css" />
 <style>
@charset "UTF-8";

* {
  box-sizing: border-box;
}

body {
  margin: 0;
}

.calculbackground {
  overflow: hidden;
  background-color: #333;
  font-family: Arial, Helvetica, sans-serif;
   padding: 14px 70px;
}



.calculbackground input{
  float: left;
  font-size: 16px;
  color: black;
  text-align: center;
 padding: 14px 16px;
  text-decoration: none;
}

.arithmeticOperation {
 float:left;
padding: 14px 16px;

}




</style>
</head>
<body>
<form method="post" action="calculer">

  <!-- 
<p>
${ empty param.operation ? 'Pour calculer entrez deux chiffres et choisissez une opération':' Le  resultat de   ' } 
${param.nombre1 } ${ param.operation }  ${param.nombre2 }
${(param.operation eq "Addition" )? param.nombre1+param.nombre2 :''} 
${(param.operation eq "Soustraction" )? param.nombre1 - param.nombre2:'' }
${(param.operation eq "Multiplication" )? param.nombre1*param.nombre2 :''}  
${(param.operation eq "Division" )? param.nombre1/param.nombre2 :''}  

</p>

-->

<p>${operationss.message } </p>

 
<fieldset>
<legend>calculatrice </legend>
<div class="calculbackground">
  <input type="number" id="nombre1" name="nombre1" value=""/> 
  
  
  
  
  <SELECT class="arithmeticOperation" name="operation"  id="operation" size="1">
<OPTION >Addition</OPTION>
<OPTION>Soustraction</OPTION>
<OPTION >Multiplication</OPTION>
<OPTION>Division</OPTION>

</SELECT>



  <input type="number" id="nombre2" name="nombre2" value=""/> 
  </div>
</fieldset>
<input type="submit" id="resultat" name="resultat" value="Resultat"/>
 
 </form>
 
 


</body>
</html>