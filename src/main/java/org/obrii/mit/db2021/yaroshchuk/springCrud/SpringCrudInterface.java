package org.obrii.mit.db2021.yaroshchuk.springCrud;


import org.obrii.mit.db2021.yaroshchuk.data.Data;
import org.springframework.data.repository.CrudRepository;

public interface SpringCrudInterface extends CrudRepository<Data, Integer> {
    
}