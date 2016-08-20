/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.company.dropwizard.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Representation class
 *
 * to model the JSON representation, this is essentially model object data (POJO)
 *
 * this class is immutable.
 * uses JavaBeans standard to allow easy serialization with Jackson
 *
 * @author colin
 */
public class Saying {

    private long id;

    @Length(max = 3)
    private String content;

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

}
