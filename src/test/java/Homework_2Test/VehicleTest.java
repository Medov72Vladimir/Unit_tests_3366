package Homework_2Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import Homework_2.Car;
import Homework_2.Motorcycle;
import Homework_2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    public void setUp(){
        car = new Car("Vaz", "Lada-Vesta", 2020);
        motorcycle = new Motorcycle("Ural", "Gear Up", 2023);
    }

    //Проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    @DisplayName("Car является транспортным средством")
    public void carIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //Проверка того, что объект Car создается с 4-мя колесами
    @Test
    @DisplayName("Car создается с 4-мя колесами")
    public void carNumWheelsTest() {
        assertEquals(4, car.getNumWheels());
    }

    //Проверка того, что объект Motorcycle создается с 2-мя колесами
    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    public void motorcycleNumWheelsTest() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //Проверка того, что объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения")
    public void carTestDriveSpeedTest() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //Проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения")
    public void motorcycleTestDriveSpeedTest() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //Проверка того, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
    // машина останавливается (speed = 0)
    @Test
    @DisplayName("Скорость Car в режиме парковки")
    public void carParkingSpeedTest() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }


    //Проверка того, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0)
    @Test
    @DisplayName("Скорость Motorcycle в режиме парковки")
    public void motorcycleParkingSpeedTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}
