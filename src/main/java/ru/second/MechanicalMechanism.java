package ru.second;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Класс MechanicalMechanism реализует интерфейс Mechanism для механических механизмов.
 * Он содержит тип и мощность механизма и определяет его работу.
 */
public class MechanicalMechanism implements Mechanism {
    private String type;
    private String power;

    // Внедрение типа через setter
    @Value("${mechanical.type}")
    public void setType(String type) {
        this.type = type;
    }

    // Внедрение мощности через setter
    @Value("${mechanical.power}")
    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String operate() {
        return "Mechanical mechanism of type: " + type + " with power: " + power;
    }

    @PostConstruct
    public void init() {
        System.out.println("MechanicalMechanism is being initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MechanicalMechanism is being destroyed.");
    }

    // Методы для вывода значений
    public String getType() {
        return type;
    }

    public String getPower() {
        return power;
    }
}