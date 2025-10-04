abstract class MotorSound {
    abstract void acellerate();
}

class Car extends MotorSound {
    @Override
    void acellerate() {
        System.out.println("Vroooom");
    }
}

class Motorcycle extends MotorSound {
    @Override
    void acellerate() {
        System.out.println("Zuuuuuum");
    }
}

public class PoliTest {
    public static void main(String[] args) {
        MotorSound myCar = new Car();
        MotorSound myMotorcycle = new Motorcycle();

        myCar.acellerate();
        myMotorcycle.acellerate();
    }
}