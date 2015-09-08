<%-- 
    Document   : Calculator1
    Created on : Sep 2, 2015, 9:09:42 PM
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator 1</title>
    </head>
    <body>
        <p><a href="AreaCalculator.jsp">Labs 2 and 3</a></p>
        <h1>Area Of Rectangle - Lab 1</h1>
        <form  method="POST" action="RectangleCalculatorController" name="form1" id="form1" >
        <label for="inputHeight" >Height </label><input required="true" id="inputHeight" type="number" name="inputHeight" />
        <label for="inputwidth" >Width </label><input id="inputWidth" required="true" type="number" name="inputWidth" />
        <input type="submit" value="Calculate" name="submit" id="submit"/>
        </form>
    </body>
</html>
