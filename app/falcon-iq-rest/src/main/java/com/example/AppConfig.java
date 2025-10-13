package com.example;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {
  public AppConfig() {
    // auto-register all @Path resources in this package
    packages("com.example.api");
    
    // Explicitly register Jackson for JSON support
    register(JacksonFeature.class);
  }
}
