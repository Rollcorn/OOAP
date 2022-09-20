package Lesson2;

/**
 * 1. Что такое наследование, композиция и полиморфизм
 */
public class Task1 {
    // Пример наследованияи автобус и лодка являются трансортом предназначенном на какое-то количество пасажиров
    // но они расширяют родительский класс собственными свойствеными им деталями (полями).
    // Трансортное средство
    class Vehicle {
        int passangers;
        // Пример композиции: MovementSource является частью транспортного средства, но не является самим трансопртным
        //средством, имеет собственную логику поведения.
        MovementSource source;

        public Vehicle(int passangers, MovementSource source) {
            this.passangers = passangers;
            this.source = source;
        }
    }

    // Пример полиморфизма: для построения автобуса необходимо покрыть требования его родительского класса Vehicle
    // в источнике движения (MovementSource) для автобуса этим источником является Motor который является MovementSource.
    // Автобус
    class Bus extends Vehicle {
        private int veels;
        public Bus(int passangers, int veels, Motor motor ) {
            super(passangers, motor);
            this.veels = veels;
        }
    }

    // Лодка
    class Boat extends Vehicle {
        private boolean hasСabin;
        public Boat(int passangers, Sail sail, boolean hasСabin) {
            super(passangers, sail);
            this.hasСabin = hasСabin;
        }
    }

    // Источник движения
    class MovementSource {
        private int speed;
        public void move(){}
    }

    // Парус
    class Sail extends MovementSource {
    }

    // Автомобильный двигатель
    class Motor extends MovementSource {
    }


}
