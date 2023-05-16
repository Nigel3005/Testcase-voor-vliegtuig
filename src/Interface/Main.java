package Interface;

public class Main {
    public static void main(String[] args) {
        Car Car = new Car();
        Car.move();
        movable Bike = new Bike();
        Bike.move();
        Animal Dog = new Dog();
        Dog.eat();
        Dog dog = (Dog) Dog;
        dog.bark();
        Train Train = new Train();
        Train.move();

        IetsMove(Train);
    }

    public static void IetsMove(movable m) {
        m.move();
    }
}

interface movable {
    void move();
}

interface IetsMet4Wielen {
    public int Wielen = 4;
}

class Car implements movable {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike implements movable {
    public void move() {
        System.out.println("Bike is moving");
    }
}

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Train implements movable {
    public void move() {
        System.out.println("Train is moving");
    }
}

// Path: src\SelfLearning\Main.java