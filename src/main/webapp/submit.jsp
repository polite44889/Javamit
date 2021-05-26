<%@page import="org.obrii.mit.dp2021.yaroshchuk.UserInterface"%>
<%@page import="org.obrii.mit.dp2021.yaroshchuk.Application"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Lab 2</title>
    <style>
        body{
            background-color: yellow;
        }
    </style>
</head>
<body>
    <div>
        <%
            Application app = (Application)request.getAttribute("app");
            UserInterface user = app.getUser();
        %>
        <p>Ваше ім'я: <%= user.getName()%></p><br>
        <p>Ваше прізвище: <%= user.getSurname()%></p><br>
        <p>Ваший вік: <%= user.getAge()%></p><br>
        <p>Ваше місто: <%= user.getCity()%></p><br>
        <a class="return" href="<%=request.getContextPath()%>">Назад</a>
    </div>

</body>
</html>

