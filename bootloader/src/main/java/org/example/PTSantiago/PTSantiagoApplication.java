package org.example.PTSantiago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan(basePackages = "org.example.PTSantiago.output.entity")
public class PTSantiagoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PTSantiagoApplication.class, args);
    }

}