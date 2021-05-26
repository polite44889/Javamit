package org.obrii.mit.dp2021.yaroshchuk;

import javax.servlet.http.HttpServletRequest;

public class Application {

    protected UserInterface user;
    public Application() {
    }
    
    public void setUser(HttpServletRequest request){
        user = new User(
        request.getParameter("name"),
        request.getParameter("surname"),
        Integer.parseInt(request.getParameter("age")),
        request.getParameter("city"));
    }

    
    final public UserInterface getUser(){
    return user;
    }
    
}
