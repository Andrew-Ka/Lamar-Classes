/*
 * Andrew, Grayson, Trevor
 * 12/2/2024
 * Dr. Bo Sun
 * CPSC 4317, Computer Networks
 * Purpose: Utilize Dijkstra's algorithm to a premade graph scheme
 */

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;


public class dijkstra {

    static int graphLen;
    static String[][] forwardingTable; //= new String[graphLen][4];
    static List<Integer>[] paths; //stores the full path of each node
    /*
     * Forwarding Table will have 4 columns
     * Col 0 is the vertex #
     * Col 1 is to track if it is found or not (boolean, but 0/1)
     * Col 2 is cost
     * Col 3 is the path, the vertex b4 it
     */


    static int[][] djikstraAlg(int[][] graph, int startNode){
        graphLen = graph.length;
        //initialize the forwarding table
        forwardingTable = new String[graphLen][4];
        //checker
        //System.out.println(forwardingTable.length);
        paths = new ArrayList[graphLen];
        //initialize table
        for(int i=0; i<graph.length; i++) {
            forwardingTable[i][0] = "" + i;
            forwardingTable[i][1] = "" + 0;
            if(i == startNode) {
                forwardingTable[i][2] = "" + 0; //cost for starting node is 0
                //[i][2] = 0; geez i havent touched java in some time
                forwardingTable[i][3] = "" + 0; //path is itself
                paths[i]= new ArrayList<>();
                paths[i].add(startNode);//path for startnode is itself
            }else {
                forwardingTable[i][2] = "" + 100;
                forwardingTable[i][3] =  "" + (-1);
                paths[i]=new ArrayList<>();// initialize path for each node
            }
        }

        //check if all the vertexes have been found
        boolean allFound = false; //first, none found
        int minVert = startNode;
        while(!allFound){
            //set the vertex to found
            forwardingTable[minVert][1] = "" + 1;
            //now update neighbors
            updateNeigh(graph, minVert);

            //checker
            /*for(int i=0; i<forwardingTable.length; i++){
                for(int j=0; j<forwardingTable[i].length; j++){
                    System.out.print(forwardingTable[i][j] + "    ");
                }
                System.out.println();
            }*/


            for(int i=0; i<graph.length; i++){ //check if all found
                if(forwardingTable[i][1].equals("0")){
                    allFound = false;
                    break;
                }else{
                    allFound = true;
                }
            }
            minVert = findMinVert();

        }


        //need to reformat
        int[][] forwardingTableInts = new int[graphLen][4];
        for(int i=0; i<graphLen; i++){
            forwardingTableInts[i][0] = i; //node
            if(paths[i].size()>1){
                forwardingTableInts[i][1]=paths[i].get(1); //next hop is second node
            }
            else{
                forwardingTableInts[i][1]=paths[i].get(0); //nextHop is itself
            }
            forwardingTableInts[i][2] = Integer.parseInt(forwardingTable[i][2]); //cost
            forwardingTableInts[i][3] = Integer.parseInt(forwardingTable[i][3]); //path
        }
        return forwardingTableInts;
    }

    static void updateNeigh(int[][] graph,int currentNode){
        //updates neighbor cost and path
        int proposedCost;
        for(int i=0; i<graphLen; i++){
            if(graph[currentNode][i] != -1){ //check for neighbors
                //if neighbor, have to check if current cost is less than new path
                proposedCost = Integer.parseInt(forwardingTable[currentNode][2]) + graph[currentNode][i];
                //checker
                //System.out.println(proposedCost + " is the proposed cost");
                //if new path costs less, update
                if(proposedCost < Integer.parseInt(forwardingTable[i][2])){
                    forwardingTable[i][2] = "" + proposedCost; //update the cost
                    forwardingTable[i][3] = "" + currentNode; //update the next-hop
                    //checker
                    //System.out.println("Update: " + forwardingTable[i][2] + " at " + i + ",2 and " + forwardingTable[i][3] + " at " + i + ",3");
                    // Update the path for node i to include currentNode's path + i
                    paths[i] = new ArrayList<>(paths[currentNode]); // Copy current node's path
                    paths[i].add(i); // Append the current node to complete the path
                }
            }
        }
    }

    static int findMinVert(){
        //going on the assumption that the graph passed
        // in was the forwarding table and that the
        // cost is in column 3, aka [i][2]
        //also has to not be found already (column 2, aka [i][1]

        int min = -1;
        for(int i=0; i<graphLen; i++){
            if(forwardingTable[i][1].equals("0")){
                if(min == -1){
                    // First unvisited node we encounter
                    min = i;
                }else{
                    int currentCost = Integer.parseInt(forwardingTable[i][2]);
                    int minCost = Integer.parseInt(forwardingTable[min][2]);

                    // Compare costs
                    if (currentCost < minCost) {
                        min = i; // Update min if we find a lower cost
                    } else if (currentCost == minCost) {
                        // If costs are equal, choose the node with the lower index
                        if (i < min) {
                            min = i;
                        }
                    }
                }
            }
        }

        //checker
        //System.out.println(min + " is the new minimum that has not been found");
        return min;
    }
}