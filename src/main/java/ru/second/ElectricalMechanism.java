package ru.second;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Класс ElectricalMechanism реализует интерфейс Mechanism для электрических механизмов.
 * Он содержит напряжение и мощность механизма и определяет его работу.
 */
public class ElectricalMechanism implements Mechanism {
    private String voltage;
    private String power;

    // Внедрение напряжения через setter
    @Value("${electrical.voltage}")
    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    // Внедрение мощности через setter
    @Value("${electrical.power}")
    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String operate() {
        return "Electrical mechanism with voltage: " + voltage + " and power: " + power;
    }

    @PostConstruct
    public void init() {
        System.out.println("ElectricalMechanism is being initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ElectricalMechanism is being destroyed.");
    }

    // Методы для вывода значений
    public String getVoltage() {
        return voltage;
    }

    public String getPower() {
        return power;
    }
}