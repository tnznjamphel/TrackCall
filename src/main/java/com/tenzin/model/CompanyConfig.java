package com.tenzin.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class CompanyConfig {
    @Bean
    CommandLineRunner commandLineRunner(CompanyRepository repository){
        return args -> {
            Company persistent =
                    new Company(
                            "Persistent",
                            "Washington",
                            "java_developer",
                            "contract",
                            80000,
                            -1,
                            "VDart",
                            "Kartik",
                            LocalDate.of(2022, Month.SEPTEMBER,20)
                    );
            Company HomeDepot =
                    new Company(
                            "HomeDepot",
                            "Atlanta",
                            "java_developer",
                            "contract",
                            70000,
                            -1,
                            "iQuadra",
                            "Rias",
                            LocalDate.of(2022, Month.SEPTEMBER,27)
                    );
                    repository.saveAll(List.of(persistent,HomeDepot));

        };
    }
}
