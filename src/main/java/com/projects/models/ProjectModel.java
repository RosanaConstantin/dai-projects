package com.projects.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProjectModel {
    private Long id;

    private String acronym;

    private String statusName;

    private String programme;

    private String title;

    private String startDate;

    private String endDate;

    private String objective;

    private String totalCost;

    private String maxContribution;

    private String call;

    private String fundingScheme;

    private String coordinator;

    private String coordinatorCountry;

    private String participants;

    private String participantsCountry;
}
