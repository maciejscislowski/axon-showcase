package com.maciejscislowski.axonframework.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.UUID;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

/**
 * @author Maciej.Scislowski@gmail.com
 */
@NoArgsConstructor // required by JPA and Event Sourced Aggregate reconstruction
@ToString
@EqualsAndHashCode
@Aggregate
@Entity
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @AggregateIdentifier
    private TaskId taskId;

    private String title;

    @CommandHandler
    public Task(CreateTaskCommand command) {
        apply(new TaskCreatedEvent(new TaskId(UUID.randomUUID()), command.getTitle()));
    }

    @EventSourcingHandler
    private void on(TaskCreatedEvent event) {
        this.taskId = event.getTaskId();
        this.title = event.getTitle();
    }

}
