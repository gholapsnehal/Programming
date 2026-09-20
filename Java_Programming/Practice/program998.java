/*
-----------------------            STEPS             ------------------------------------

    Parking Automation System

    STEP 1 :    Create required enums
    STEP 2 :    Vehicle hierarchy creation 
    STEP 3 :    Vehicle FactoryCreation (Factory Pattern)
    STEP 4 :    ParkingSpot Hierarchy
    STEP 5 :    ParkingObserver Class
    STEP 6 :    ParkingFloor class
    STEP 7 :    ParkingDisplayBoard (Observer pattern)
    STEP 8 :    ParkingStrategy Class (Strategy pattern)
    STEP 9 :    PricingStrategy Class (strategy pattern)
    STEP 10 :   PaymentStrategy Class
    STEP 11 :   ParkingTicket Class
    STEP 12 :   EntryGate Class
    STEP 13 :   ExitGate class
    STEP 14 :   ParkingLot Class (Singleton pattern)
    STEP 15 :   Main Class(Controller)

---------------------------------------------------------------------------------------
    
 */

import java.util.*;
import java.time.Duration;
import java.time.LocalDateTime;

/////////////////////////////////////////////////////////////////////////////////////////////
// STEP 1 :     Create enums
//              It is used to create fixed constants which are required throughout the project
//
/////////////////////////////////////////////////////////////////////////////////////////////


// Repersents different types of vehicle supported by the project
enum VehicleType
{
    BIKE,
    CAR,
    TRUCK
}

// Represents different types of parking spots
enum SpotType
{
    BIKE,
    CAR,
    TRUCK    
}

// Represents the current state of parking ticket
enum TicketStatus
{
    ACTIVE,
    CLOSED
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
// STEP 2 :     Create Vehicle class hierarchy
//              It is used to create multiple types of classes which are represents the types
//              of vehicles
// CONCEPTS :   Abstraction, Inheritance, Polymorphism, Encapsulation
//
/////////////////////////////////////////////////////////////////////////////////////////////

// Class which represents a generic vehicle

abstract class Vehicle
{
    // abstracted (Hidden) characteristics of class
    private String vehicleNumber;

    private VehicleType vehicleType;

    // Parameterized constructor
    public Vehicle(String vehicleNumber, VehicleType vehicleType)
    {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType; 
    }

    // Concrete Getter Method
    public VehicleType getVehicleType()
    {
        return this.vehicleType;
    }

    // Concrete Getter Method
    public String getVehicleNumber()
    {
        return this.vehicleNumber;
    }

    // Every concrete class will provide its own definition
    public abstract void display();

}

// Class which represents the vehicle type as Bike
class Bike extends Vehicle
{
    // Parametrized constructor
    public Bike(String vehicleNumber)
    {
        // Calls Vehicle class constructor
        super(vehicleNumber, VehicleType.BIKE);

    }

    // Method overriding
    @Override 
    public void display()
    {
        System.out.println("Bike : "+getVehicleNumber());
    }
}

// Class which represents the vehicle type as Car
class Car extends Vehicle
{
    // Parametrized constructor
    public Car(String vehicleNumber)
    {
        // Calls Vehicle class constructor
        super(vehicleNumber, VehicleType.CAR);

    }

    // Method overriding
    @Override 
    public void display()
    {
        System.out.println("Car : "+getVehicleNumber());
    }
}

// Class which represents the vehicle type as Truck
class Truck extends Vehicle
{
    // Parametrized constructor
    public Truck(String vehicleNumber)
    {
        // Calls Vehicle class constructor
        super(vehicleNumber, VehicleType.TRUCK);

    }

    // Method overriding
    @Override 
    public void display()
    {
        System.out.println("Truck : "+getVehicleNumber());
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
// STEP 3 :     Create Vehicle Factory Class
//              It is used to centralized the creation of vehicle objects
//              
// CONCEPTS :   Factory Design Pattern
//
/////////////////////////////////////////////////////////////////////////////////////////////

class VehicleFactory
{
    //  Created and return the desired class object
    public static Vehicle creatVehicle(VehicleType type, String number)
    {
        switch(type)
        {
            case BIKE:
                return new Bike(number);

            case CAR:
                return new Car(number);

            case TRUCK:
                return new Truck(number);

            default:
                throw new IllegalArgumentException("Invalid Vehicle Type");
        }
    }
}

public class program998
{
    public static void main(String A[])
    {

    }
}