package ru.second;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.second")
@PropertySource("classpath:mechanism.properties")
public class AppConfig {

    @Bean
    public MechanicalMechanism mechanicalMechanism() {
        return new MechanicalMechanism();
    }

    @Bean
    public ElectricalMechanism electricalMechanism() {
        return new ElectricalMechanism();
    }

}
