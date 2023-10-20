package io.diagrid.dapr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;

@SpringBootApplication
public class PizzaStoreAppTest {
    public static void main(String[] args) {
        SpringApplication.from(PizzaStore::main)
                .with(DaprTestConfiguration.class)
                .run(args);
    }

    
    @ImportTestcontainers(DaprLocal.class)
    static class DaprTestConfiguration {
       
    }

}