package test;

import org.glassfish.jersey.server.ResourceConfig;

public class App extends ResourceConfig {
    public App() {
        packages("test");
    }
}
