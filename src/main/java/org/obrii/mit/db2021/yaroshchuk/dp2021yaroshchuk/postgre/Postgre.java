
package org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.postgre;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.data.Data;
import org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.servlet.CrudDataInterface;


public class Postgre implements CrudDataInterface{
    private Statement statement;
    private Connection connection;
    
    public Postgre(){
       
        
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.
                    getConnection("jdbc:postgresql://obrii.org:5432/db2021mit21s21", 
                            "s21", 
                            "5085");
            this.connection.setAutoCommit(false);
            this.statement = this.connection.createStatement();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
            SQL("CREATE TABLE IF NOT EXISTS users (id integer primary key not null, name text not null, age integer not null);");
            }
        

        
    
    private void SQL(String sql){
        try{
            statement.executeUpdate(sql);
            connection.commit();
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    @Override
    public List<Data> readData() {
        try {
            ResultSet r = this.statement.executeQuery("SELECT * FROM users");
            List<Data> data = new ArrayList<>();

            while (r.next()) {               
                data.add(new Data(
                        r.getInt("id"), r.getString("name"), r.getInt("age")));
            }

            return data;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return new ArrayList<>();
        }
        
    }

    @Override
    public void createData(Data data) {
        List<Data> datasize = this.readData();
        data.setId(datasize.size());
        SQL(String.format("INSERT INTO users (id, name, age) VALUES (%d, '%s', %d);",
                data.getId(), data.getName(), data.getAge()));
    }

    @Override
    public void deleteData(int id) { 
        SQL("DELETE FROM users WHERE id="+id);
        
    }
    
    @Override
    public void updateData(int id, Data data) {  
        SQL(String.format("UPDATE users "
                        + "SET name='" + data.getName() + "' , "
                        + "age=" + data.getAge()                      
                        + "WHERE id="+id)
        );
    }

    public List<Data> sortData(String phrase) {
        List<Data> newData = new ArrayList<>();
        for (Data d : this.readData()) {
            if(d.getName().contains(phrase)){
                newData.add(d);}
        }
        return newData;
    }

    
}
