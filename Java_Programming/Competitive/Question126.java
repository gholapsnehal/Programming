///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 66 : Question 5
//  Description   : 1. Implements a Social Network Shortest Connection finder using 
//                     Breadth-First Search (BFS) algorithm on an unweighted graph.
//                  2. Represents friendship networks using an Adjacency List (Map<String, List<String>>).
//                  3. Uses a Queue for level-order traversal and a Set to track visited nodes, 
//                     storing path details to reconstruct the shortest route from source to target.
//                  4. Displays one valid shortest path and calculates the minimum number of connections.
//
//  Input         : Friendship network connections:
//                  Amit  -> Rahul, Pooja
//                  Rahul -> Neha
//                  Pooja -> Kiran
//                  Neha  -> Riya
//                  Kiran -> Riya
//                  Source: Amit, Target: Riya
//
//  Output        : Shortest path and number of connections:
//                  One possible path:
//                  Amit -> Rahul -> Neha -> Riya
//                  Number of connections: 3
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class SocialNetwork
{
    private Map<String, List<String>> adjList;

    public SocialNetwork()
    {
        adjList = new HashMap<>();
    }

    // Adds friendship connection (u -> v)
    public void addFriendship(String u, String v)
    {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.get(u).add(v);
    }

    // Finds shortest path using BFS
    public void findShortestConnection(String strSource, String strTarget)
    {
        if(!adjList.containsKey(strSource))
        {
            System.out.println("Source user not found in network");
            return;
        }

        Queue<List<String>> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        List<String> initialPath = new ArrayList<>();
        initialPath.add(strSource);

        queue.add(initialPath);
        visited.add(strSource);

        List<String> shortestPath = null;

        while(!queue.isEmpty())
        {
            List<String> currentPath = queue.poll();
            String lastNode = currentPath.get(currentPath.size() - 1);

            // Target node reached
            if(lastNode.equals(strTarget))
            {
                shortestPath = currentPath;
                break;
            }

            // Explore neighbors
            if(adjList.containsKey(lastNode))
            {
                for(String neighbor : adjList.get(lastNode))
                {
                    if(!visited.contains(neighbor))
                    {
                        visited.add(neighbor);
                        List<String> newPath = new ArrayList<>(currentPath);
                        newPath.add(neighbor);
                        queue.add(newPath);
                    }
                }
            }
        }

        if(shortestPath != null)
        {
            System.out.println("One possible path:\n");
            System.out.println(String.join(" -> ", shortestPath));
            System.out.println("\nNumber of connections :");
            System.out.println(shortestPath.size() - 1);
        }
        else
        {
            System.out.println("No path exists between " + strSource + " and " + strTarget);
        }
    }
}

class Question126
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        SocialNetwork network = new SocialNetwork();

        System.out.println("Enter total number of friendship entries :");
        int iEdges = sobj.nextInt();

        System.out.println("Enter connections (Format: User FriendName) :");
        for(int iCnt = 0; iCnt < iEdges; iCnt++)
        {
            String u = sobj.next();
            String v = sobj.next();
            network.addFriendship(u, v);
        }

        System.out.println("Enter Source User :");
        String strSource = sobj.next();

        System.out.println("Enter Target User :");
        String strTarget = sobj.next();

        System.out.println();
        network.findShortestConnection(strSource, strTarget);

        sobj.close();
    }
}