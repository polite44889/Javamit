package org.obrii.mit.dp2021.yaroshchuk.repository;

import org.obrii.mit.dp2021.yaroshchuk.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
}
