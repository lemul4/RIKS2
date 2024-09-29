package ru.second;

/**
 * Класс MechanicalMechanism реализует интерфейс Mechanism для механических механизмов.
 * Он содержит тип и мощность механизма и определяет его работу.
 */
public class MechanicalMechanism implements Mechanism {
    private final String type;
    private String power;

    //Конструктор класса MechanicalMechanism.
    public MechanicalMechanism(String type) {
        this.type = type;
    }

    // Setter для мощности
    public void setPower(String power) {
        this.power = power;
    }

    //Возвращает тип механического  механизма.
    @Override
    public String getType() {
        return type;
    }

    //Возвращает мощность механического механизма.
    @Override
    public String getPower() {
        return power;
    }

    //Операция, выполняемая механическим механизмом.
    @Override
    public String operate() {
        return "Mechanical mechanism of type: " + type + " with power: " + power;
    }
}
