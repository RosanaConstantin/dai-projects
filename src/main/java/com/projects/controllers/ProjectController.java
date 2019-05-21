package com.projects.controllers;

import com.projects.entities.Project;
import com.projects.repositories.ProjectRepository;
import com.projects.services.CordisService;
import com.projects.services.Parser.Parser;
import com.projects.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;


@RestController
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(value = "/projects", headers = "Access-Control-Allow-Origin=*", method = RequestMethod.GET)
    public ResponseEntity getProjects(@RequestParam(name = "page", defaultValue = "0") final Integer pageNumber,
                                      @RequestParam(name = "size", defaultValue = "10") final Integer pageSize){

        return ResponseEntity.ok(projectService.getProjects(pageNumber, pageSize));
    }

    @Autowired
    private ProjectRepository projectRepository;

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<com.projects.entities.Project> findAll() {
        return projectRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/project/{id}")
    public Optional<Project> findById(@PathVariable Long id) {
        return projectRepository.findById(id);
    }

    @CrossOrigin
    @GetMapping("/update")
    public void update() throws IOException {
        CordisService.download();
        CordisService.unzip();
        Parser.parseDoc("/Users/roconstantin/Documents/university/Semestrul II/DAI/dai-homework/src/main/resources/tmp/search-result-metadata.xml", true);
        return;
    }
//
//    @GetMapping("/title/{ProjectTitle}")
//    public List<Project> findByTitle(@PathVariable String ProjectTitle) {
//        return projectRepository.findByTitle(ProjectTitle);
//    }
//
//    @GetMapping("/{id}")
//    public Project findOne(@PathVariable long id) {
//        return projectRepository.findById(id)
//                .orElseThrow(ProjectNotFoundException::new);
//    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Project create(@RequestBody Project Project) {
//        Project Project1 = projectRepository.save(Project);
//        return Project1;
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable long id) {
//        projectRepository.findById(id)
//                .orElseThrow(ProjectNotFoundException::new);
//        projectRepository.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    public Project updateProject(@RequestBody Project Project, @PathVariable long id) {
//        if (Project.getId() != id) {
//            throw new ProjectIdMismatchException();
//        }
//        projectRepository.findById(id)
//                .orElseThrow(ProjectNotFoundException::new);
//        return projectRepository.save(Project);
//    }
}