package com.company.dropwizard;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * A configuration class blueprint for a configuration object in DropWizard
 *
 * Jackson does the mapping from YAML to Configuration object
 *
 * @author colin
 */
public class HelloWorldConfiguration extends Configuration {

    // Annotated with Hibernate's @NotEmpty to allow throw exception upon startup

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    //region getters and setters

    /*
     * Annotated with @JsonProperty to allow (de)serialization between properties
     * from/to a YAML configuration file
     */

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    //endregion

}
