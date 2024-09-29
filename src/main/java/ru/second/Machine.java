package ru.second;

//Класс Machine представляет машину, которая использует механизм.
public class Machine {
    private final Mechanism mechanism;

    // Конструктор класса Machine.
    public Machine(Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    /**
     * Запускает машину с использованием механизма.
     * Выводит в консоль описание работы механизма.
     */
    public void start() {
        System.out.println("Starting machine with " + mechanism.operate());
    }
}
