package DSA.nonLinear.graphs.representation.matrix;

import java.util.Scanner;

public class GraphMatrixDirected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //n -> number of nodes
        // m -> number of edges
        //We cover all the node, so time complexity is O(n)
        System.out.print("Enter number of nodes (n): ");
        int n=sc.nextInt();
        System.out.print("Enter number of edges (m): ");
        int m= sc.nextInt();
        int[][] adjMatrix=new int[n+1][n+1];//0 based indexing
        //let's take input of of the edges from the user
        System.out.println("Enter the edges (u v):");
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            //directed graph u<-->v
            adjMatrix[u][v]=1;
            //adjMatrix[v][u]=1;//skip this line for directed graph
        }
        //print the adjacency matrix
        System.out.println("\nAdjacency Matrix:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
