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

// STEP 1 :     Create enums
//              It is used to create fixed constants which are required throughout the project

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


public class program996
{
    public static void main(String A[])
    {

    }
}