package ru.second;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Класс Main запускает Spring-контекст и тестирует работу машины с механизмом.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Machine machine = context.getBean("machine", Machine.class);
        machine.start();

        Mechanism electricalMechanism = context.getBean("electricalMechanism", Mechanism.class);
        System.out.println("Electrical mechanism operating: " + electricalMechanism.operate());

        context.close();
    }
}
