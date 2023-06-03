package GraphFramework;

/*
 *  @authors Asil, Qamar, Aroub,Khalida, Huda
 * B9A
 * CPCS-324
 * Project Code
 * 4th June. 2023
 */

public class SingleSourceSPAlg {
    
        Graph graph;
        Vertex source;
        boolean[] visitedVertex;
        int[] distance;
	String[] path;
                

	public void computeDijkstraAlg(Graph graph,Vertex source) {

                this.graph = graph; 
                int srclabel = Integer.parseInt(source.getLabel());
            
		distance = new int[graph.verticesNo]; //  shortest distance from source too each vertex (calculate cost of path)
		path = new String[graph.verticesNo]; // path from src to each vertex

		for (int i = 0; i < graph.verticesNo; i++) {
                        graph.vertices.get(i).setIsVisited(false); //make not visted again for each new src given 
			distance[i] = Integer.MAX_VALUE; //infinite distance from source to vertex
		}


		distance[srclabel] = 0;//  source vertex from itself to itself =0 distance
		Vertex src = graph.vertices.get(srclabel); //src vertex
		path[srclabel] = src.displayInfo(); // src vertex as first location to be printed

		for (int i = 0; i < graph.verticesNo - 1; i++) {//thro all vertices
			int u = minDistance(distance); //find min distance to a vetex that has not been vidsited yet
			graph.vertices.get(u).setIsVisited(true) ; //set as visted

                    for (Edge edge : graph.vertices.get(u).getAdjList()) { ///loop thro neighbors of this newly vistited vertex

                        if (graph.vertices.get(Integer.parseInt(edge.getTarget().getLabel())).getIsVisited() != true && edge.getWeight() != Integer.MAX_VALUE
                                && edge.getWeight() != 0) {//only if neighbor not visited and weight>0
                            /**
                             * Continue only if: current distance (current minimum distance) + current
                             * iterated edge is -> smaller than the target distance if the target location
                             * in array distance is set, meaning it applicable of the condition if not then
                             * its still (maybe) max value or just bigger
                             */
                            if (distance[u] + edge.getWeight() < distance[Integer.parseInt(edge.getTarget().getLabel())]) {
                               
                                distance[Integer.parseInt(edge.getTarget().getLabel())] = distance[u] + edge.getWeight(); // Update the target location to smaller distance 
                                
                                path[Integer.parseInt(edge.getTarget().getLabel())] = path[u] + " – " + edge.getTarget().displayInfo(); // Add target to path
                                
                            }}}} 
	printResult();} 

	public int minDistance(int[] smallestDistance) {
		
            int u = 0;
		
            int minDistance = Integer.MAX_VALUE;

		for (int i = 0; i < graph.verticesNo; i++) {
			    
                    if (graph.vertices.get(i).getIsVisited() != true && smallestDistance[i] < minDistance) { //vertex not visited and less than min distance
				
                        minDistance = smallestDistance[i]; //  new min distance
				
                        u = i; 
			}
		}
		return u;//vertex w min distance
	}

	public void printResult() {
            
		// Start loop from 1 to ignore 1st Vertex
            for (int i = 1; i < graph.verticesNo; i++) {
                    
                if(distance[i]>=Integer.MIN_VALUE && distance[i]<0 || distance[i]<=Integer.MAX_VALUE && distance[i]>59990 ){ 
                    
                    System.out.println("\n" + path[i] + " route length: no path"); //no path between source and target vertex
			
                    }
                    
                else System.out.println("\n" + path[i] + " route length: " + distance[i]); // print path and weight
		} 
	} 

} 



    
