<%-- 
    Document   : AreaCalculator
    Created on : Sep 5, 2015, 2:06:04 PM
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="i" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Calculator</title>
    </head>
    <body>
        
         <h1>Area Of Rectangle</h1>
        <form  method="POST" action="AreaCalculatorController?shape=rectangle"
               name="form1" id="form1" >
        <label for="inputHeight" >Height </label><input required="true" id="inputHeight" type="number" name="inputHeight" />
        <label for="inputwidth" >Width </label><input required="true" id="inputWidth" type="number" name="inputWidth" />
        <input type="submit" value="Calculate" name="submit" id="submit"/>
        </form>
         <p style="color:blue;">
             ${rectangleMessage}
         </p>
         <h1>Area Of Triangle</h1>
        <form  method="POST" action="AreaCalculatorController?shape=triangle"
               name="form1" id="form1" >
        <label for="inputHeight" >Height </label><input required="true" id="inputHeight" type="number" name="inputHeight" />
        <label for="inputwidth" >Width </label><input required="true" id="inputWidth" type="number" name="inputWidth" />
        <input type="submit" value="Calculate" name="submit" id="submit"/>
        </form>
         <p style="color:blue;">
             ${triangleMessage}
         </p>
         <h1>Area Of Circle</h1>
        <form  method="POST" action="AreaCalculatorController?shape=circle"
               name="form1" id="form1" >
        <label for="inputHeight" >Radius </label><input required="true" id="inputRadius" type="number" name="inputRadius" />
        <input type="submit" value="Calculate" name="submit" id="submit"/>
        </form>
         <p style="color:blue;">
            ${circleMessage}
         </p>
    </body>
</html>
