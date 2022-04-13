package com.etiya.cqrsWithCleanArchitecture.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Courses")
public class Course {
    @Id
    @Column(name = "id")
    private String accountTypeId;
    @Column(name = "name")
    private String name;


}
