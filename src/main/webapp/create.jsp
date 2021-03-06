<%@page contentType="text/html" pageEncoding="UTF-8"%>

<style>
    body{
        background-color: yellow;
    }
    
    .title{
        text-align: center;
    }
    
    .formik{
        display: flex;
        justify-content: center;
    }
    
</style>

<div class="formik">
    <form action="<%=request.getContextPath()%>/" method="post">
                <input type="hidden" name="id" value="0">
                Введіть дані <br>
                <input type="hidden" name="title" value="Submited"/>
                <input type="text" name="name" placeholder="Введіть ваше імя" required><br/>
                <input type="number" name="age" placeholder="Вік" required><br/>
                <button class="button" type="submit">Відправити</button>
            </form>
</div>
