package ru.second;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Класс Main запускает Spring-контекст и тестирует работу машины с механизмом.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MechanicalMechanism mechanicalMechanism = context.getBean(MechanicalMechanism.class);

        System.out.println("Mechanical mechanism operating: " + mechanicalMechanism.operate());

        ElectricalMechanism electricalMechanism = context.getBean(ElectricalMechanism.class);
        System.out.println("Electrical mechanism operating: " + electricalMechanism.operate());

        context.close();
    }
}
