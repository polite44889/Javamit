/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.data.Data;
import org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.files.Config;
import org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.files.FilesCrud;

@WebServlet(name = "DataServlet", urlPatterns = {"/"})
public class DataServlet extends HttpServlet {
    FilesCrud filesCrud = new FilesCrud(new File(Config.getFileName()));
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Read users
        if (Config.getFileName().equals("")) {
            Config.setFileName(this.getServletContext().getRealPath("") + "data.txt");
            filesCrud = new FilesCrud(new File(Config.getFileName()));
        }
        
        if(request.getParameter("search")!=null){
            request.setAttribute("data", filesCrud.sortData(request.getParameter("search")));
            }
        else{
            request.setAttribute("data", filesCrud.readData());
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
        filesCrud.createData(user);
        doGet(req,resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Delete User
        filesCrud.deleteData(Integer.parseInt(req.getParameter("id")));
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
        filesCrud.updateData(Integer.parseInt(req.getParameter("id")), user);
        doGet(req, resp); 
    }
}