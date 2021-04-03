
<%@page import="java.util.List"%>
<%@ page import="org.obrii.mit.db2021.yaroshchuk.data.Data" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<style>
    body{
        background-color: yellow;
    }
    
    .title{
        text-align: center;
    }
    
    .table{
        display: flex;
        justify-content: center;
        
        
        
        
 
    }
    
</style>

<h1 class="title">Заповнення анкети імя та вік</h1>
            <%List<Data> dataList = (List<Data>) request.getAttribute("data");%>
            <div class="table"> 
                <table>
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>name</th>
                            <th>age</th>                            
                        </tr>
                    </thead>
                    <tbody>
                        <%for (Data data : dataList) {%>
                    <tr>
                        <td><%=data.getId()%></td>
                        <td><%=data.getName()%></td>
                        <td><%=data.getAge()%></td>
                      
                        <td>
                            <form action="update.jsp" method="post">
                                <input type="hidden" name="id" value="<%=data.getId()%>">
                                <input type="hidden" name="name" value="<%=data.getName()%>">
                                <input type="hidden" name="age" value="<%=data.getAge()%>">
                                <input type="submit" value="Оновити дані">
                            </form>
                        </td>
                        <td>
                            <form action="<%=request.getContextPath()%>/form" method="get">
                                <input type="hidden" name="id" value="<%=data.getId()%>">
                                <input type="submit" value="Видалити">
                            </form>
                        </td>
                    </tr>
                   <%}%>
                   <tr>
                       <td colspan="4">
                           <form action= "<%=request.getContextPath()%>/" method="get">
                                <input type="text" name="search">
                                <input type="submit" value="Пошук користувача">
                           </form>
                       </td>
                        <td colspan="3">
                            <form action="create.jsp" methd="get">
                                <input type="submit" value="Добавити користувача" >
                            </form>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>


        </div>
            </div>
    </div>
