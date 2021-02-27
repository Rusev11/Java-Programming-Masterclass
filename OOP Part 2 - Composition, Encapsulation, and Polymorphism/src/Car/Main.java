package Car;

class Suzuki extends Car {

    public Suzuki(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Suzuki -> startEngine()";
    }

    public String accelerate() {
        return "Suzuki -> accelerate()";
    }

    public String brake() {
        return "Suzuki -> brake()";
    }
}

class VW extends Car {

    public VW(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "VW -> startEngine()";
    }

    public String accelerate() {
        return "VW -> accelerate()";
    }

    public String brake() {
        return "VW -> brake()";
    }
}

class Opel extends Car {

    public Opel(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Opel -> startEngine()";
    }

    public String accelerate() {
        return "Opel -> accelerate()";
    }

    public String brake() {
        return "Opel -> brake()";
    }
}

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(int cylinder, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Opel opel = new Opel(4, "Corsa");
        System.out.println(opel.startEngine());
        System.out.println(opel.accelerate());
        System.out.println(opel.brake());

        VW vw = new VW(4, "Polo");
        System.out.println(vw.startEngine());
        System.out.println(vw.accelerate());
        System.out.println(vw.brake());

        Suzuki suzuki = new Suzuki(4, "Jimny");
        System.out.println(suzuki.startEngine());
        System.out.println(suzuki.accelerate());
        System.out.println(suzuki.brake());
    }
}
