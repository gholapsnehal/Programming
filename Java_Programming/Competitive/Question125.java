///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 66 : Question 4
//  Description   : 1. Implements a Software Dependency Resolver using Topological Sort (Kahn's Algorithm).
//                  2. Represents software modules and their dependencies as a Directed Acyclic Graph (DAG):
//                     - Map key   : Module Name (e.g., Database, Backend, API)
//                     - Map value : List of dependent modules that rely on this module
//                  3. Calculates in-degrees (number of incoming dependencies) for each module.
//                  4. Uses a Queue to initialize modules with in-degree 0 first, decrementing in-degrees 
//                     of dependent modules until all modules are initialized in valid topological order.
//
//  Input         : Dependency relations (Source -> Target):
//                  Database -> Backend
//                  Backend  -> API
//                  API      -> Frontend
//
//  Output        : Valid initialization order:
//                  Database
//                  Backend
//                  API
//                  Frontend
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class DependencyResolver
{
    private Map<String, List<String>> adjList;
    private Map<String, Integer> inDegree;

    public DependencyResolver()
    {
        adjList = new LinkedHashMap<>();
        inDegree = new LinkedHashMap<>();
    }

    // Adds a dependency edge (u -> v)
    public void addDependency(String u, String v)
    {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());

        inDegree.putIfAbsent(u, 0);
        inDegree.putIfAbsent(v, 0);

        adjList.get(u).add(v);
        inDegree.put(v, inDegree.get(v) + 1);
    }

    // Resolves and displays valid initialization order (Kahn's Topological Sort)
    public void resolveOrder()
    {
        Queue<String> queue = new ArrayDeque<>();

        // Enqueue modules with no prerequisites (in-degree == 0)
        for(String node : inDegree.keySet())
        {
            if(inDegree.get(node) == 0)
            {
                queue.add(node);
            }
        }

        List<String> resolvedOrder = new ArrayList<>();

        while(!queue.isEmpty())
        {
            String current = queue.poll();
            resolvedOrder.add(current);

            // Reduce in-degree for dependent modules
            for(String neighbor : adjList.get(current))
            {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if(inDegree.get(neighbor) == 0)
                {
                    queue.add(neighbor);
                }
            }
        }

        // Check if all modules were resolved (No Circular Dependency)
        if(resolvedOrder.size() != inDegree.size())
        {
            System.out.println("Circular dependency detected! Cannot resolve order");
            return;
        }

        System.out.println("Valid initialization order :\n");
        for(String module : resolvedOrder)
        {
            System.out.println(module);
        }
    }
}

class Question125
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DependencyResolver resolver = new DependencyResolver();

        System.out.println("Enter number of dependency relations :");
        int iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid number of relations");
            return;
        }

        System.out.println("Enter dependencies (Format: ModuleA ModuleB for ModuleA -> ModuleB) :");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            String u = sobj.next();
            String v = sobj.next();
            resolver.addDependency(u, v);
        }

        System.out.println();
        resolver.resolveOrder();

        sobj.close();
    }
}