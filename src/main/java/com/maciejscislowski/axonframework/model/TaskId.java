package com.maciejscislowski.axonframework.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

/**
 * @author Maciej.Scislowski@gmail.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Embeddable
public class TaskId implements Serializable {

    private static final long serialVersionUID = 1L;
    private UUID id;

}
