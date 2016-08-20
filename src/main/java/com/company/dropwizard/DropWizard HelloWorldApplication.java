package com.company.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropWizard HelloWorldApplication extends Application<DropWizard HelloWorldConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropWizard HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropWizard HelloWorld";
    }

    @Override
    public void initialize(final Bootstrap<DropWizard HelloWorldConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropWizard HelloWorldConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
