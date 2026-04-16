package com.pluralsight;
import java.util.Scanner;
public class VehicleInventoryApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000.00f);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700.00f);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500.00f);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500.00f);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000.00f);
        //vehicles[0].displayAllVehicles(vehicles);
        int option;



        //System.out.println(option);
        boolean isRunning = true;
        while(isRunning){
            option = menu(input);
            if(option==1) {
                Vehicle.displayAllVehicles(vehicles);
            }
            else if (option==2) {
                Vehicle searchVehicleModel = new Vehicle(0, "", "", 0, 0.0f);
                searchVehicleModel.searchVehicleModelByPrompt(input, vehicles);
            }
            else if(option==3){
                Vehicle searchVehiclePriceRange = new Vehicle(0, "", "", 0, 0.0f);
                searchVehiclePriceRange.searchVehicleByPriceRangePrompt(input, vehicles);
            }
            else if (option==4) {
                Vehicle searchVehicleColor = new Vehicle(0, "", "", 0, 0.0f);
                searchVehicleColor.searchVehicleColorByPrompt(input, vehicles);
            }
            else if(option==5){
                Vehicle newVehicle = new Vehicle(0, "", "", 0, 0.0f);
                newVehicle.addAVehicle();
                for(int i = 0; i < vehicles.length; i++) {
                    if(vehicles[i] == null) {
                        vehicles[i] = newVehicle;
                        break;
                    }
                }
            }
            else if(option==6){
                isRunning = false;
            }
            else{
                System.out.println("Invalid entry please try again.");
            }
        }
        //System.out.println(option);
        input.close();
    }
    public static int menu(Scanner input){
        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles");
        System.out.println(" 2 - Search by make/model");
        System.out.println(" 3 - Search by price range");
        System.out.println(" 4 - Search by color");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.println("Enter your command: ");
        int command;
        command = input.nextInt();
        return command;
    }
}
