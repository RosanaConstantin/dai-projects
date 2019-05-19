package com.projects.repositories;

import com.projects.entities.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
    Optional<Project> findById(final Long id);

    //Iterable<Message> findAll(Sort sort);

    Page<Project> findAll(Pageable pageable);

  //  List<Project> findByTitle(String projectTitle);
}
