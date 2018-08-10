package com.maciejscislowski.axonframework.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author Maciej.Scislowski@gmail.com
 */
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public class TaskCreatedEvent {

    private final TaskId taskId;
    private final String title;

}
