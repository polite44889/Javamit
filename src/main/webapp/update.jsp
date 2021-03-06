<%@page import="java.util.List"%>
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
    <form action="<%=request.getContextPath()%>/form" method="post">
                <input type="hidden" name="id" value="<%=request.getParameter("id")%>">                
                Fill in form <br>
                <input type="text" name="name" value="<%=request.getParameter("name")%>" required><br/>               
                <input type="number" name="age" value="<%=request.getParameter("age")%>" required><br/>                                                                               
                <button class="button" type="submit">Update</button>
    </form>
    <a class="return" href="<%=request.getContextPath()%>">Return</a>
</div>  
    