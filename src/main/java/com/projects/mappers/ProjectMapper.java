package com.projects.mappers;

import com.projects.models.ProjectModel;
import com.projects.entities.Project;

public class ProjectMapper {

    private ProjectMapper() {
    }

    public static ProjectModel toModel(final Project project) {
        return ProjectModel.builder()
                .id(project.getId())
                .acronym(project.getAcronym())
                .statusName(project.getStatusName())
                .programme(project.getProgramme())
                .title(project.getTitle())
                .startDate(project.getStartDate())
                .endDate(project.getEndDate())
                .objective(project.getObjective())
                .totalCost(project.getTotalCost())
                .maxContribution(project.getMaxContribution())
                .call(project.getCall())
                .fundingScheme(project.getFundingScheme())
                .coordinator(project.getCoordinator())
                .coordinatorCountry(project.getCoordinatorCountry())
                .participants(project.getParticipants())
                .participantsCountry(project.getParticipantsCountry())
                .build();
    }

}
