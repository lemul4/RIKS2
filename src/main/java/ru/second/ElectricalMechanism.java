package ru.second;

/**
 * Класс ElectricalMechanism реализует интерфейс Mechanism для электрических механизмов.
 * Он содержит напряжение и мощность механизма и определяет его работу.
 */
public class ElectricalMechanism implements Mechanism {
    private final String voltage;
    private String power;

    // Конструктор класса ElectricalMechanism.
    public ElectricalMechanism(String voltage) {
        this.voltage = voltage;
    }

    // Setter для мощности
    public void setPower(String power) {
        this.power = power;
    }

    // Возвращает напряжение электрического механизма.
    public String getVoltage() {
        return voltage;
    }

    // Возвращает мощность электрического механизма.
    @Override
    public String getPower() {
        return power;
    }

    // Возвращает тип электрического механизма.
    @Override
    public String getType() {
        return "Electrical mechanism";
    }

    // Операция, выполняемая электрическим механизмом.
    @Override
    public String operate() {
        return getType() + " with voltage: " + voltage + " and power: " + power;
    }
}
