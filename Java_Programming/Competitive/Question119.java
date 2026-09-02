///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 65 : Question 3
//  Description   : 1. Creates a custom Patient class containing Patient Name and Severity level.
//                  2. Implements Comparable interface in Patient class to sort patients:
//                     - Higher severity levels are treated first (Descending order of severity).
//                  3. Uses Java PriorityQueue to automatically maintain treatment order based on severity.
//                  4. Accepts patient data from user, enqueues them into PriorityQueue, and 
//                     dequeues/serves them in order of priority
//
//  Input         : Patients with severity levels:
//                  Rahul 2
//                  Amit  5
//                  Pooja 1
//                  Neha  4
//
//  Output        : Treatment expected order (Highest severity first):
//                  Amit
//                  Neha
//                  Rahul
//                  Pooja
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.PriorityQueue;
import java.util.Scanner;

class Patient implements Comparable<Patient>
{
    public String name;
    public int severity;

    public Patient(String name, int severity)
    {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient obj)
    {
        // Higher severity level should be treated first (Descending order)
        return obj.severity - this.severity;
    }
}

class HospitalManagement
{
    private PriorityQueue<Patient> patientQueue;

    public HospitalManagement()
    {
        patientQueue = new PriorityQueue<>();
    }

    // Adds a new patient to the priority queue
    public void addPatient(String name, int severity)
    {
        patientQueue.add(new Patient(name, severity));
    }

    // Process/treat patients based on severity priority
    public void processPatients()
    {
        System.out.println("Expected order:\n");
        while(!patientQueue.isEmpty())
        {
            Patient p = patientQueue.poll();
            System.out.println(p.name);
        }
    }
}

class Question119
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        HospitalManagement hobj = new HospitalManagement();

        System.out.println("Enter total number of patients :");
        int iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid number of patients");
            return;
        }

        System.out.println("Enter Patient Name and Severity :");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            String name = sobj.next();
            int severity = sobj.nextInt();
            hobj.addPatient(name, severity);
        }

        System.out.println();
        hobj.processPatients();

        sobj.close();
    }
}