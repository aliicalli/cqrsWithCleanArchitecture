package com.etiya.cqrsWithCleanArchitecture.application.courses.commands.create;

import lombok.Data;

@Data
public class CourseCreatedEvent {

    private String accountTypeId;
    private String name;
}
