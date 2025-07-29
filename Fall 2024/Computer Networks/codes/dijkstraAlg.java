/*
 * Andrw Kalathra
 * 10/25/2024
 * Dr. Bo Sun
 * CPSC 4317, Computer Networks
 * Purpose: Utilize Dijkstra's algorithm to a premade graph scheme
 */
//package ;

public class dijkstraAlg {

	public static void main(String[] args) {
		//hardcoding the graph
		int[][] graph = {
			//   A  B  C  D  E    
				{0, 2, 5, 1, -1, -1}, //A
				{2, 0, 3, 2, -1, -1}, //B
				{5, 3, 0, 3, 1, 5},   //C
				{1, 2, 3, 0, 1, -1},  //D 
				{-1, -1, 1, 1, 0, 2}, //E
				{-1, -1, 5, -1, 2, 0} //F
				};
		System.out.println("Hello");
	}
	
	int[][] djikstra(int[][] graph, int startNode){
		int[][] forwardingTable = new int[graph.length][4];
		/*
		 * Forwarding Table will have 4 columns
		 * Col 0 is the vertex #
		 * Col 1 is to track if it is found or not (boolean, but 0/1
		 * Col 2 is cost
		 * Col 3 is the path, the vertex b4 it
		 */
		
		for(int i=0; i<graph.length; i++) {
			forwardingTable[i][0] = i;
			forwardingTable[i][1] = 0;
			if(i == startNode) {
				[i][2] = 0;
			}else {
				[i][2] = 100;
			}
		}
		
		
		return forwardingTable;
	}

}
