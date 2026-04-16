package com.pluralsight;

import java.util.Scanner;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
   private  int odometerReading;
    private float price;
    Scanner input=new Scanner(System.in);
    public Vehicle(){
        this.vehicleId = 0;
        this.makeModel = "";
        this.color = "";
        this.odometerReading = 0;
        this.price = 0.0f;
    }
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price){
        this.vehicleId=vehicleId;
        this.makeModel=makeModel;
        this.color=color;
        this.odometerReading=odometerReading;
        this.price=price;
    }
    public  static void displayAllVehicles(Vehicle[] vehicles) {
        System.out.println("=====All vehicles======");
        for (Vehicle v : vehicles) {
            if (v != null) {
                System.out.println("ID: " + v.getVehicleId() + ", Model: " + v.getMakeModel() + ", Color: " + v.getColor() + ", Odometer: " + v.getOdometerReading() + ", Price: $" + v.getPrice());
            }
        }
    }
public void addAVehicle(Vehicle[] vehicles){
prompt(input,vehicles);
}
    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void prompt(Scanner input,Vehicle[] vehicles){
        System.out.println("What is the vehicleId?: ");
        this.setVehicleId(input.nextLong());

        input.nextLine();
        System.out.print("Enter Make/Model: ");
        this.setMakeModel(input.nextLine());

        // Get color from user
        System.out.print("Enter Color: ");
        this.setColor(input.nextLine());

        // Get odometer reading from user
        System.out.print("Enter Odometer Reading: ");
       this.setOdometerReading(input.nextInt());

        // Get price from user
        System.out.print("Enter Price: $");
        this.setPrice(input.nextFloat());
        System.out.println();
    }
}
