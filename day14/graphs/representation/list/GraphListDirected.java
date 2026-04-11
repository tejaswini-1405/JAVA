package DSA.nonLinear.graphs.representation.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphListDirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n -> number of nodes
        // m -> number of edges
        //We cover all the node, so time complexity is O(n)
        System.out.print("Enter number of nodes (n): ");
        int n = sc.nextInt();
        System.out.print("Enter number of edges (m): ");
        int m = sc.nextInt();
        //Adjacency List Representation
        List<List<Integer>> adjList=new ArrayList<>();
        //if we use this structure List<List<>>,wee need to initialize to empty lists first
        //Node 1:{}, Node 2:{}, Node 3:{} an so on
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }
        //read the edges from the user
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            //directed graph u<--> v
            adjList.get(u).add(v);
            //adjList.get(v).add(u);//skip this line for directed graph
        }
        //print the adjacency list
        for(int i=1;i<=n;i++){
            System.out.print("Node:-> " + i + ": neighbours: " );
            for(int v:adjList.get(i)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
