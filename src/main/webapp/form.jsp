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
<div class="form_wrapper">
    <form action="<%=request.getContextPath()%>/form" method="post">
        <h2>Заповніть форму!</h2>
        <input type="hidden" name="title" value="submited"/>
        <label for="name">Ім'я</label>
        <input type="text" id="name" name="name" placeholder="Введіть ім'я"/><br/>
        <label for="name">Прізвище</label>
        <input type="text" id="surname" name="surname" placeholder="Введіть прізвище"/><br/>
        <label for="name">Вік</label>
        <input type="number" id="age" name="age" placeholder="Введіть вік"/><br/>
        <label for="name">Місто</label>
        <input type="text" id="city" name="city" placeholder="Введіть місто"/><br/>
        <button class="button" type="submit">Відправити</button>
    </form>
</div>
</body>
</html>


