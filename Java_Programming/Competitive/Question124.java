///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 66 : Question 3
//  Description   : 1. Accepts employee records containing Employee Name and Department Name.
//                  2. Uses a LinkedHashMap<String, List<String>> to group employees department-wise:
//                     - Map key   : Department Name (e.g. IT, HR, Finance)
//                     - Map value : List of Employee Names belonging to that department
//                  3. Preserves the original order of appearance of departments and employees.
//                  4. Displays the grouped department-wise employee lists.
//
//  Input         : Employee records (Name and Department):
//                  Amit IT
//                  Rahul HR
//                  Pooja IT
//                  Neha Finance
//                  Kiran HR
//                  Riya IT
//
//  Output        : Department-wise employee groups:
//                  IT:
//                  Amit
//                  Pooja
//                  Riya
//
//                  HR:
//                  Rahul
//                  Kiran
//
//                  Finance:
//                  Neha
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class EmployeeGrouper
{
    private Map<String, List<String>> departmentMap;

    public EmployeeGrouper()
    {
        departmentMap = new LinkedHashMap<>();
    }

    // Adds employee to corresponding department list
    public void AddEmployee(String strName, String strDept)
    {
        if(!departmentMap.containsKey(strDept))
        {
            departmentMap.put(strDept, new ArrayList<>());
        }
        departmentMap.get(strDept).add(strName);
    }

    // Displays department-wise grouped employees
    public void DisplayGroupedEmployees()
    {
        for(Map.Entry<String, List<String>> entry : departmentMap.entrySet())
        {
            System.out.println(entry.getKey() + ":");
            for(String name : entry.getValue())
            {
                System.out.println(name);
            }
            System.out.println();
        }
    }
}

class Question124
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of employee records:");
        int iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid size");
            return;
        }

        EmployeeGrouper egobj = new EmployeeGrouper();

        System.out.println("Enter Employee Name and Department :");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            String strName = sobj.next();
            String strDept = sobj.next();
            egobj.AddEmployee(strName, strDept);
        }

        System.out.println("\nExpected output:\n");
        egobj.DisplayGroupedEmployees();

        sobj.close();
    }
}