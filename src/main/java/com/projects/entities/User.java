package com.projects.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {
    @Id
    @Column(name = "id")
    private Long id;

    private String name;

    private String username;

    private String password;
}

