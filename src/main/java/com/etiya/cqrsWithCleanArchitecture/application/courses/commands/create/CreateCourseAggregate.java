package com.etiya.cqrsWithCleanArchitecture.application.courses.commands.create;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class CreateCourseAggregate {
    @AggregateIdentifier
    private String accountTypeId;
    private String name;

    @CommandHandler
    public CreateCourseAggregate (CreateCourseCommand command){
    }

}
