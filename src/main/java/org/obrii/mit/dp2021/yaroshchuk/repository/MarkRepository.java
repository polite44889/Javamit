package org.obrii.mit.dp2021.yaroshchuk.repository;

import org.obrii.mit.dp2021.yaroshchuk.entity.MarkLesson;
import org.obrii.mit.dp2021.yaroshchuk.entity.MarkLessonKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "mark", path="mark")
public interface MarkRepository extends JpaRepository<MarkLesson,MarkLessonKey>{
    
}
