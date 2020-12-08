/* Пример №1 */
//: c06:Car.java
// композиция с использованием открытых объектов

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