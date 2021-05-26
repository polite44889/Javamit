package org.obrii.mit.dp2021.yaroshchuk.repository;

import org.obrii.mit.dp2021.yaroshchuk.entity.MitGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "group", path="group")
public interface MitGroupRepository extends JpaRepository<MitGroup,Integer>{
    
}
