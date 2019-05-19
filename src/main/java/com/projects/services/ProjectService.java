package com.projects.services;


import com.projects.mappers.ProjectMapper;
import com.projects.models.ProjectModel;
//import com.projects.services.CordisService;
import com.projects.repositories.ProjectRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectModel> getProjects(final Integer pageNumber, final Integer pageSize) {
    //    CordisService.getProjects();
        final Pageable pageable = PageRequest.of(pageNumber, pageSize, new Sort(Sort.Direction.ASC, "acronym"));
        return projectRepository.findAll(pageable).stream()
                .map(ProjectMapper::toModel)
                .collect(Collectors.toList());
    }
}
