package com.pluarsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public  Dealership getDealership(){
        Dealership dealership = new Dealership("","","");


        {
            String line = null;
            int lineNumber = 1;
            try {

                BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
                while ((line = br.readLine()) != null) {
                    String[] pipes = line.split("\\|");

                    if (lineNumber == 1) {
                        String name = pipes[0];
                        dealership.setName(name);
                        String address = pipes[1];
                        dealership.setAddress(address);
                        String phone = pipes[2];
                        dealership.setPhone(phone);
                    } else {
                        int vin = Integer.parseInt(pipes[0]);
                        int year = Integer.parseInt(pipes[1]);
                        String make = pipes[2];
                        String model = pipes[3];
                        String vehicleType = pipes[4];
                        String color = pipes[5];
                        int odometer = Integer.parseInt(pipes[6]);
                        double price = Double.parseDouble(pipes[7]);


                        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);


                    }

                    lineNumber++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}