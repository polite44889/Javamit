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
        <h1>Вітання</h1>
        <form action="<%=request.getContextPath()%>/form" method="get">
            <button class="button" type="submit">Перейти на сторінку з заповненням даних</button>
        </form>
        <img src="uml.JPG" alt="uml"/>

    </body>
</html>


                    
