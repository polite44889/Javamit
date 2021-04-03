package org.obrii.mit.db2021.yaroshchuk.springCrud;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;

import org.obrii.mit.db2021.yaroshchuk.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringCrud {
    int id=1;
    
    
    @Autowired
    SpringCrudInterface DBInterface;
    
    public SpringCrud(){
    }
    
    public Iterable<Data> readData(){
        return DBInterface.findAll();
    }
    
            
    public ArrayList<Data> sortData(String s){
        Iterable<Data> data = DBInterface.findAll();
        Iterator<Data> iterator = data.iterator();
        ArrayList<Data> newData = new ArrayList<Data>();

        while(iterator.hasNext()){
            Data item = iterator.next();
            if(item.getName().contains(s)){
                newData.add(item);
            }
        }
        return newData;
    }
    
    public void createData(Data data){
        DBInterface.save(data);
    }
    
    public void deleteData(Integer id){
        DBInterface.deleteById(id);
    }
    
    public void updateData(Data data,Integer id){
        Data update = DBInterface.findById(id).get();
        update.setName(data.getName());
        update.setAge(data.getAge());
        DBInterface.save(update);
    }
 }