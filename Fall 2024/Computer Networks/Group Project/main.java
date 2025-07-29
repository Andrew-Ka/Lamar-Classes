import java.util.Stack;

public class main {
    public static void main(String[] args) {
        //hardcoding the graph

        int[][] graph = {
                // A    B    C    D    E    F
                { 0,   2,  -1,   5,  -1,  -1}, // A
                { 2,   0,   2,  -1,   1,  -1}, // B
                {-1,   2,   0,   2,  -1,   3}, // C
                { 5,  -1,   2,   0,  -1,  -1}, // D
                {-1,   1,  -1,  -1,   0,   3}, // E
                {-1,  -1,   3,  -1,   3,   0}  // F
        };
        int[][] result = new int[0][];

        System.out.print("\nStep 1");
        int startNode = 0;
        for(int p=0; p< graph.length; p++) {
            startNode = p;


            System.out.printf("\nWe have a starting node of %c.", (char)(startNode+65));
            result = dijkstra.djikstraAlg(graph, startNode);
            /*
            for (int i = 0; i < result.length; i++) {
                System.out.printf("Node %d has a next hop of %d\n", i, result[i][1]);
            }
            */
            System.out.println();

            //part A
            System.out.printf("%-12s %15s %12s","Destination","Next-Hop","Cost");
            for(int i=0; i<graph.length;i++){
                System.out.printf("\n%11c %16c %12d",65+result[i][0], 65+result[i][1], result[i][2]);
            }
            System.out.println();


            /*
            for (int i = 0; i < result.length; i++) {
                char currentNode = (char) (i + 65);
                System.out.print(currentNode + ":    ");
                int path = i;
                do {
                    myStack.push(path);
                    //checker
                    //System.out.println("Peeking stack: " + myStack.peek());
                    path = result[path][3];
                    //checker
                    //System.out.println("Next Hop is: " + nextHop);
                } while ((!myStack.isEmpty()) && (myStack.peek() != startNode));

                char holderNode;
                while (!myStack.isEmpty()) {
                    holderNode = (char) (myStack.pop() + 65);
                    System.out.print(holderNode + " --> ");
                }
                System.out.print(" : Cost = " + result[i][2]);
                System.out.println();
            }
            */


        }


        //part B
        System.out.print("\nStep 2");
        System.out.print("\nThe path from nodes A to F that data packet P1 traversed\n");

        Stack<Integer> myStack = new Stack<>();
        int path = 0;
        do {
            myStack.push(path);
            //checker
            //System.out.println("Peeking stack: " + myStack.peek());
            path = result[path][3];
            //checker
            //System.out.println("Next Hop is: " + nextHop);
        } while ((!myStack.isEmpty()) && (myStack.peek() != startNode));
        Stack<Integer> myNewStack = new Stack<>();
        while(!myStack.isEmpty()){
            myNewStack.push(myStack.pop());
        }
        char holderNode;
        while (!myNewStack.isEmpty()) {
            holderNode = (char) (myNewStack.pop() + 65);
            System.out.print(holderNode + " --> ");
        }


        //part C
        graph[1][2] = -1;
        graph[2][1] = -1;
        //copy and paste, I love that flavor
        System.out.print("\n\nStep 3");
        System.out.print("\nThe link between B and C is broken!");
        System.out.print("\nHere are the new forwarding tables\n");
        startNode = 0;
        for(int p=0; p< graph.length; p++) {
            startNode = p;


            System.out.printf("\nWe have a starting node of %c.", (char) (startNode + 65));
            result = dijkstra.djikstraAlg(graph, startNode);
            /*
            for (int i = 0; i < result.length; i++) {
                System.out.printf("Node %d has a next hop of %d\n", i, result[i][1]);
            }
            */
            System.out.println();

            //part A
            System.out.printf("%-12s %15s %12s", "Destination", "Next-Hop", "Cost");
            for (int i = 0; i < graph.length; i++) {
                System.out.printf("\n%11c %16c %12d", 65 + result[i][0], 65 + result[i][1], result[i][2]);
            }
            System.out.println();
        }
        

        //part d
        System.out.print("\nStep 4");
        System.out.print("\nThe path from nodes A to F that data packet P1 traversed\n");

        myStack = new Stack<>();
        path = 0;
        do {
            myStack.push(path);
            //checker
            //System.out.println("Peeking stack: " + myStack.peek());
            path = result[path][3];
            //checker
            //System.out.println("Next Hop is: " + nextHop);
        } while ((!myStack.isEmpty()) && (myStack.peek() != startNode));
        myNewStack = new Stack<>();
        while(!myStack.isEmpty()) {
            myNewStack.push(myStack.pop());
        }
        while (!myNewStack.isEmpty()) {
            holderNode = (char) (myNewStack.pop() + 65);
            System.out.print(holderNode + " --> ");
        }
    }
}