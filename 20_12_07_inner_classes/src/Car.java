/* Пример №1 */
//: c06:Car.java
// композиция с использованием открытых объектов

// Терминология:
//
// Существует четыре категории вложенных классов:
//
// Статические вложенные классы и не статические вложенные классы.
// Вложенные классы, объявленные статически, называются вложенными статическими классами.

// Внутренние классы — когда объект внутреннего класса связан с объектом обрамляющего класса.
// Не статические вложенные классы называются внутренними классами, если они связанны с внешним классом.

// Локальные классы — объявленные внутри блока кода и не являющиеся членом обрамляющего класса.
// В этом случае можно рассматривать класс как локальную переменную типа класс.

// Анонимные классы – наследуемые, от какого либо класса, классы в которых при объявлении не задано имя класса.
//

// двигатель 
class Engine {
    public void start() {
    }

    public void rev() {
    }

    public void stop() {
    }
}

class Wheel {
    public void inflare(int psi) {
    }// накачать
}

// окно
class Window {
    public void rollup() {
    }// приоткрыть

    public void rolldown() {
    }// опустить
}

// дверь
class Door {
    public Window window = new Window();

    public void open() {
    }//открыть

    public void close() {
    }// закрыть
}

// машина 
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(),
            right = new Door();//две двери

    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflare(72);
    }
}
