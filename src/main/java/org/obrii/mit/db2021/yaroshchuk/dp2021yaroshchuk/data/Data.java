
package org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.data;

import java.io.Serializable;
import java.util.Arrays;

public class Data implements Serializable{
    
    private int id;
    private String name;
    private int age;

    public Data() {
    }

    public Data(int id, String name, int age) {
        this.id=id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

 
   
  
    
    
    
    
}
