package com.etiya.cqrsWithCleanArchitecture.application.accountTypes.commands.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAccountTypeCommand {

    @TargetAggregateIdentifier
    private String accountTypeId;

    private String accountName;
    private String description;
    private double price;

}
