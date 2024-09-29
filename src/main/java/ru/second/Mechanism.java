package ru.second;

// interface Mechanism определяет общий контракт для механизмов.
public interface Mechanism {

    // Возвращает тип механизма.
    String getType();

    // Возвращает мощность механизма.
    String getPower();

    // Операция, выполняемая механизмом.
    String operate();
}
