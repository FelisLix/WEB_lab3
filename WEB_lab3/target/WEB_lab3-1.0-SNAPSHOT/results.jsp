<jsp:useBean id="function" scope="request" type="web.web_lab3.logic.Function"/>
<%--
  Created by IntelliJ IDEA.
  User: FelisLIX
  Date: 18.10.2024
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Results</title>
</head>
<body>
<img src="variant.png"  alt="умова"/>
<h2>Результати обчислень:</h2>
<p>Сума всіх елементів масиву значень функції: ${function.findSum()}</p>
<p>Середнє арифметичне елементів масиву значень функції: ${function.findArithmeticMean()}</p>
<p>Найменшим є елемент під номером ${function.findMinY()} із значенням функції: ${function.getYFromArray(function.findMinY())} та аргументом: ${function.getXFromArray(function.findMinY())}</p>
<p></p>
<p>Найбільшим є елемент під номером ${function.findMaxY()} із значенням функції: ${function.getYFromArray(function.findMaxY())} та аргументом: ${function.getXFromArray(function.findMaxY())}</p>

<form action="index.jsp" method="get">
    <input type="submit" value="Назад">
</form>

</body>
</html>
