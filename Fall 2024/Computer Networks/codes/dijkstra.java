/*
 * Andrew Kalathra
 * 10/25/2024
 * Dr. Bo Sun
 * CPSC 4317, Computer Networks
 * Purpose: Utilize Dijkstra's algorithm to a premade graph scheme
 */

import java.util.Stack;

public class dijkstra {


    public static void main(String[] args) {
        //hardcoding the graph
        int[][] graph = {
                //A    B    C    D    E    F
                 {0,   2,   5,   1,  -1,  -1}, //A
                 {2,   0,   3,   2,  -1,  -1}, //B
                 {5,   3,   0,   3,   1,   5}, //C
                 {1,   2,   3,   0,   1,  -1}, //D
                 {-1, -1,   1,   1,   0,   2}, //E
                 {-1, -1,   5,  -1,   2,   0}  //F
        };
        System.out.println("We have a starting node of A.");
        int[][] result = djikstraAlg(graph, 0);
        for(int i=0; i<result.length; i++){
            System.out.printf("Node %d has a next hop of %d\n", i, result[i][1]);
        }

        System.out.println();
        Stack<Integer> myStack = new Stack<>();
        for(int i=0; i< result.length; i++){
            char currentNode = (char)(i + 65);
            System.out.print(currentNode + ":    ");
            int nextHop = i;
            do{
                myStack.push(nextHop);
                //checker
                //System.out.println("Peeking stack: " + myStack.peek());
                nextHop = result[nextHop][1];
                //checker
                //System.out.println("Next Hop is: " + nextHop);
            }while((!myStack.isEmpty()) && (myStack.peek() != 0));

            char holderNode;
            while(!myStack.isEmpty()){
                holderNode = (char)(myStack.pop() + 65);
                System.out.print( holderNode + " --> ");
            }
            System.out.println();
        }
    }

    static int graphLen;
    static String[][] forwardingTable; //= new String[graphLen][4];
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

        //initialize table
        for(int i=0; i<graph.length; i++) {
            forwardingTable[i][0] = "" + i;
            forwardingTable[i][1] = "" + 0;
            if(i == startNode) {
                forwardingTable[i][2] = "" + 0; //cost for starting node is 0
				//[i][2] = 0; geez i havent touched java in some time
                forwardingTable[i][3] = "" + 0; //path is itself
            }else {
				forwardingTable[i][2] = "" + 100;
                forwardingTable[i][3] =  "" + (-1);
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
                }else{
                    allFound = true;
                }
            }
            minVert = findMinVert();

        }


        //need to reformat
        int[][] forwardingTableInts = new int[graphLen][3];
        for(int i=0; i<graphLen; i++){
            forwardingTableInts[i][0] = i; //node
            forwardingTableInts[i][1] = Integer.parseInt(forwardingTable[i][3]); //next hop
            forwardingTableInts[i][2] = Integer.parseInt(forwardingTable[i][2]); //cost
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
                    min = i;
                }else{
                    if(min > Integer.parseInt(forwardingTable[i][2])){
                        min = i;
                    }
                }
            }
        }

        //checker
        //System.out.println(min + " is the new minimum that has not been found");
        return min;
    }
}