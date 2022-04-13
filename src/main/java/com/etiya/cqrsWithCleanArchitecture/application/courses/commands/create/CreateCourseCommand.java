package com.etiya.cqrsWithCleanArchitecture.application.courses.commands.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCourseCommand {

    @TargetAggregateIdentifier
    private String accountTypeId;

    private String name;
}
