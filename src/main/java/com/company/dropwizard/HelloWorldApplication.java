package com.company.dropwizard;

import com.company.dropwizard.health.TemplateHealthCheck;
import com.company.dropwizard.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Application class
 *
 * @author colin
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "Hello-World";
    }

    @Override
    public void initialize(final Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    /**
     * Runs the application
     *
     * 1) Create the required resources
     * 2) Add it to the appropriate environment
     *
     * @param configuration
     * @param environment
     */
    @Override
    public void run(final HelloWorldConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(),configuration.getDefaultName());
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
