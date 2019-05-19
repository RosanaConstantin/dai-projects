package com.projects.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Projects")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Project {
    @Id
    @Column(name = "id")
    private Long id;

    private String acronym;

    private String statusName;

    private String programme;

    private String title;
    @Column(name="startDate")
    private String startDate;
    @Column(name="endDate")
    private String endDate;

    private String objective;
    @Column(name="totalCost")
    private String totalCost;
    @Column(name="maxContribution")
    private String maxContribution;

    private String call;
    @Column(name="fundingScheme")
    private String fundingScheme;

    private String coordinator;
    @Column(name="coordinatorCountry")
    private String coordinatorCountry;

    private String participants;
    @Column(name="participantsCountry")
    private String participantsCountry;
}

