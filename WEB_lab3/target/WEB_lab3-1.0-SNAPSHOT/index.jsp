<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Лабораторна робота №3</title>
</head>
<body>
<h1> Лабораторна робота №3. Основи backend. Сервлети</h1>
<br/>
<form action="hello-servlet" method="get">
    <label for="a">a:</label>
    <input id="a" type="number" step="0.01" name="a">
    <label for="start">Початок:</label>
    <input id="start" type="number" step="0.1" name="start">
    <label for="end">Кінець інтервалу:</label>
    <input id="end" type="number" step="0.1" name="end">
    <label for="step">Крок</label>
    <input id="step" type="number" step="0.001" name="step">
    <input type="submit" value="Обчислити!">
</form>
</body>
</html>