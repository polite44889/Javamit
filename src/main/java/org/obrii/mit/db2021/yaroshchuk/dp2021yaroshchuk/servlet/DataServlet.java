
package org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.data.Data;
import org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.postgre.Postgre;


@WebServlet(name = "DataServlet", urlPatterns = {"/"})
public class DataServlet extends HttpServlet {
    Postgre postgreCrud = new Postgre();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        if(request.getParameter("search")!=null){
            request.setAttribute("data", postgreCrud.sortData(request.getParameter("search")));
            }
        else{
            request.setAttribute("data", postgreCrud.readData());
        }
        
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Create new user
        Data user = new Data(
            Integer.parseInt(req.getParameter("id")),
            req.getParameter("name"),
            Integer.parseInt(req.getParameter("age"))
        );
        postgreCrud.createData(user);
        doGet(req,resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Delete User
        postgreCrud.deleteData(Integer.parseInt(req.getParameter("id")));
        doGet(req, resp); 
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Update User
        Data user = new Data(
            Integer.parseInt(req.getParameter("id")),
            req.getParameter("name"),
            Integer.parseInt(req.getParameter("age"))
        );
        postgreCrud.updateData(Integer.parseInt(req.getParameter("id")), user);
        doGet(req, resp); 
    }
}