package com.pluarsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Vehicle vehicle = new Vehicle(68123, 2022,"Toyota", "Highlander", "SUV", "Green", 420, 39000);

    @Test
    public void testingCarVin() {
        assertEquals(68123, vehicle.getVin());
    }

    @Test
    public void testingCarYear() {
        assertEquals(2022, vehicle.getYear());
    }

    @Test
    public void testingCarMake() {
        assertEquals("Toyota", vehicle.getMake());
    }

    @Test
    public void testingCarModel() {
        assertEquals("Highlander", vehicle.getModel());
    }

    @Test
    public void testingCarType() {
        assertEquals("SUV", vehicle.getVehicleType());
    }

    @Test
    public void testingCarColor() {
        assertEquals("Green", vehicle.getColor());
    }

    @Test
    public void testingCarOdometer() {
        assertEquals(420, vehicle.getOdometer());
    }

    @Test
    public void testingCarPrice() {
        assertEquals(39000, vehicle.getPrice());
    }
}