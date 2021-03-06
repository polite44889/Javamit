/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.servlet;

import java.util.List;
import org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.data.Data;

public interface CrudDataInterface {

    void createData(Data addingData);

    List<Data> readData();

    void updateData(int id, Data data);

    void deleteData(int id);

    void writeData(List<Data> data);
    
    public List<Data> sortData(String phrase);

}