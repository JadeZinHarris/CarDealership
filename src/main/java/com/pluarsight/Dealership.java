package com.pluarsight;
import java.util.ArrayList;

public class Dealership {

    private String name;
    private String Address;
    private String phone;
    private static ArrayList<Vehicle> inventory;

    //-----------------------------------------------
    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        Address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    //-------------------------------------------------

    static class cars {

        public void addVehicle(Vehicle vehicle) {
            inventory.add(vehicle);
        }

        public void removeVehicle(Vehicle vehicle) {
            inventory.remove(vehicle);
        }

        public ArrayList<Vehicle> getAllVehicles() {

            return inventory;

        }

        public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
            ArrayList<Vehicle> inventoryWithinRange = new ArrayList<>();
            for (Vehicle vehicle : inventory) {
                if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                    inventoryWithinRange.add(vehicle);
                }
            }
            return inventoryWithinRange;
        }

        public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
            ArrayList<Vehicle> inventoryMakeModel = new ArrayList<>();
            for (Vehicle vehicle : inventory) {
                if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                    inventoryMakeModel.add(vehicle);
                }
            }
            return inventoryMakeModel;
        }

        public ArrayList<Vehicle> getVehicleByColor(String color) {
            ArrayList<Vehicle> inventoryColor = new ArrayList<>();
            {
                for (Vehicle vehicle : inventory) {
                    if (vehicle.getColor().equalsIgnoreCase(color)) {
                        inventoryColor.add(vehicle);
                    }
                }
                return inventoryColor;
            }
        }

        public ArrayList<Vehicle> getVehicleByMileage(int min, int max) {
            ArrayList<Vehicle> inventoryOdometer = new ArrayList<>();
            {
                for (Vehicle vehicle : inventory) {
                    if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                        inventoryOdometer.add(vehicle);
                    }
                }
                return inventoryOdometer;
            }
        }
        public ArrayList<Vehicle> getVehicleByType(String type) {
            ArrayList<Vehicle> inventoryType = new ArrayList<>();
            {
                for (Vehicle vehicle : inventory) {
                    if (vehicle.getVehicleType().equalsIgnoreCase(type)) {
                        inventoryType.add(vehicle);
                    }
                }
                return inventoryType;
            }
        }
    }
}
