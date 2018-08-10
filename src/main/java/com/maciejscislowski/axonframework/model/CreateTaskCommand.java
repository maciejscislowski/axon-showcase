package com.maciejscislowski.axonframework.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author Maciej.Scislowski@gmail.com
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class CreateTaskCommand {

    private final String title;

}
