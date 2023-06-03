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
            
		// Get distance array to calculate cost & Get path array to collect path passed
		distance = new int[graph.verticesNo]; // Hold the shortest distance from source to each vertex
		path = new String[graph.verticesNo]; // Hold the vertices path from the source to the vertex

		// Update all the vertices distance as infinity -- to set it later to minimum
		// distance as needed
		for (int i = 0; i < graph.verticesNo; i++) {
                        graph.vertices.get(i).setIsVisited(false);
			distance[i] = Integer.MAX_VALUE;
		}

		/**
		 * Vertex[0] requirements: distance of 0 path of the 1st vertex name
		 */
		distance[srclabel] = 0;// Distance of source vertex from itself is always 0
		Vertex src = graph.vertices.get(srclabel); // Get the source Vertex
		path[srclabel] = src.displayInfo(); // Hold 1st source as override output of the path

		// Loop Through the array
		for (int i = 0; i < graph.verticesNo - 1; i++) {
			int u = minDistance(distance); // Pick the minimum distance vertex from the set of not visited vertices
// Pick the minimum distance vertex from the set of not visited vertices
			graph.vertices.get(u).setIsVisited(true) ;
                    // Iterate through all neighbors
                    // End of the Iterator loop
                    // Mark the picked vertex as visited
                    for (Edge edge : graph.vertices.get(u).getAdjList()) {
                        /**
                         * Continue only if: 1. Vertex not visited 2. its weight is set by the
                         * (minDistance) method 3. its weight not zero
                         */
                        if (graph.vertices.get(Integer.parseInt(edge.getTarget().getLabel())).getIsVisited() != true && edge.getWeight() != Integer.MAX_VALUE
                                && edge.getWeight() != 0) {
                            /**
                             * Continue only if: current distance (current minimum distance) + current
                             * iterated edge is -> smaller than the target distance if the target location
                             * in array distance is set, meaning it applicable of the condition if not then
                             * its still (maybe) max value or just bigger
                             */
                            if (distance[u] + edge.getWeight() < distance[Integer.parseInt(edge.getTarget().getLabel())]) {
                               
                                distance[Integer.parseInt(edge.getTarget().getLabel())] = distance[u] + edge.getWeight(); // Update the target location to the
                                
                                path[Integer.parseInt(edge.getTarget().getLabel())] = path[u] + " – " + edge.getTarget().displayInfo(); // Add the target
                                
                            } 
                        } 
                    }
		} 
	printResult();} 

	/**
	 * 
	 * @param smallestDistance
	 * @return
	 */
	public int minDistance(int[] smallestDistance) {
		int u = 0;
		int minDistance = Integer.MAX_VALUE;

		// Loop through all vertices
		for (int i = 0; i < graph.verticesNo; i++) {
			// The vertex must be not visited and its less than the minimum distance
			if (graph.vertices.get(i).getIsVisited() != true && smallestDistance[i] < minDistance) {
				minDistance = smallestDistance[i]; // The new minimum distance
				u = i; 
			}
		}
		return u;
	}

	public void printResult() {
		// Start loop from 1 to ignore 1st Vertex
                
		for (int i = 1; i < graph.verticesNo; i++) {
                    if(distance[i]!=Integer.MAX_VALUE){
			System.out.println("\n" + path[i] + " route length: " + distance[i]);}
                    
                    else System.out.println("\n" + path[i] + " route length: no path");// Print linked path and final cost
												// sequentially
		} 
	} 

} 



    
