package com.pluralsight;

import java.util.Scanner;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
   private  int odometerReading;
    private float price;
    Scanner input=new Scanner(System.in);

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price){
        this.vehicleId=vehicleId;
        this.makeModel=makeModel;
        this.color=color;
        this.odometerReading=odometerReading;
        this.price=price;
    }
    public  static void displayAllVehicles(Vehicle[] vehicles) {
        System.out.println("=====All vehicles======");
        int counter=0;
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle v = vehicles[i];
            if (v != null) {
                System.out.println("ID: " + v.getVehicleId() + ", Model: " + v.getMakeModel() + ", Color: " + v.getColor() + ", Odometer: " + v.getOdometerReading() + ", Price: $" + v.getPrice());
                counter=i+1;
            }
//
        }
//
        System.out.println(counter+" is the amount of vehicles in inventory.");
    }
public void addAVehicle(){
prompt(input);
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
    public void prompt(Scanner input){
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
    public void searchVehicleByPriceRangePrompt(Scanner input,Vehicle[] vehicles){
        System.out.print("Enter the highest amount you can pay: $");
        input.nextLine();
        float max=(input.nextFloat());
        System.out.print("Enter the lowest amount you want to pay: $");
        float min=(input.nextFloat());
        boolean matchFound=false;
        for(Vehicle vehicle:vehicles){
            if(vehicle!=null&&vehicle.getPrice()>=min&&vehicle.getPrice()<=max){
                System.out.println("ID: " + vehicle.getVehicleId() + ", Model: " + vehicle.getMakeModel() + ", Color: " + vehicle.getColor() + ", Odometer: " + vehicle.getOdometerReading() + ", Price: $" + vehicle.getPrice());
                matchFound=true;
            }
        }
        if(!matchFound){
            System.out.println("We don't have a car in the price range you are looking for");
        }
    }
    public void searchVehicleModelByPrompt(Scanner input,Vehicle[] vehicles){
        System.out.print("Enter Make/Model you are looking for ");
        input.nextLine();
        makeModel=input.nextLine();
        for(Vehicle vehicle:vehicles){
            if(vehicle!=null&& makeModel.equalsIgnoreCase(vehicle.getMakeModel())){
                System.out.println("ID: " + vehicle.getVehicleId() + ", Model: " + vehicle.getMakeModel() + ", Color: " + vehicle.getColor() + ", Odometer: " + vehicle.getOdometerReading() + ", Price: $" + vehicle.getPrice());
            }
        }
     }
     public void searchVehicleColorByPrompt(Scanner input,Vehicle[] vehicles){
         System.out.print("Enter the color you are looking for ");
         input.nextLine();
         color=input.nextLine();
         for(Vehicle vehicle:vehicles){
             if(vehicle!=null&& color.equalsIgnoreCase(vehicle.getColor())){
                 System.out.println("ID: " + vehicle.getVehicleId() + ", Model: " + vehicle.getMakeModel() + ", Color: " + vehicle.getColor() + ", Odometer: " + vehicle.getOdometerReading() + ", Price: $" + vehicle.getPrice());
             }
         }
     }
}
