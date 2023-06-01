package GraphFramework;

import java.util.ArrayList;

/*
 *  @authors Asil, Qamar, Aroub,Khalida
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
        ArrayList <Vertex> path = new ArrayList();

                
  public  void computeDijkstraAlg(Graph graph,Vertex source) {
      
      String printedPath = "loc. "+source.getLabel()+": city ";
      
      int routeLength = 0;
    
      int count = graph.verticesNo;
    
    visitedVertex = new boolean[count];
    
    distance = new int[count];
    for (int i = 0; i < count; i++) {
      
        visitedVertex[i] = false;
      
        distance[i] = Integer.MAX_VALUE;
    } // Initialize all verticies to infinity and not visited

    distance[0] = 0; // Initialize distance from first vertices (source) to itself to 0
   
    for (int i = 0; i < count; i++) {
      // Update the distance between neighbouring vertex and source vertex
      
      int u = findMinDistance(distance, visitedVertex);
      
      visitedVertex[u] = true;
      // Update all the neighbouring vertex distances
      
      for (int v = 0; v < count; v++) { 
          
          for(int q =0; q<graph.vertices.get(v).getAdjList().size(); i++ ){// moves through every element in adjacency list
              
              int dis = graph.vertices.get(v).getAdjList().get(q).getWeight(); // get weight of current edge in adjancency matrix
                 
              if(dis>0)
              
                  if (!visitedVertex[v] && (distance[u] + dis < distance[v])) { // if distance ot be added is less than distance traveled so far
                   
                      distance[v] = distance[u] + dis; // update distance traveled so far
                                      
                      path.add(graph.vertices.get(v).getAdjList().get(q).getTarget());                   
                   
                      printedPath+=graph.vertices.get(v).getAdjList().get(q).getWeight() +"– loc."+graph.vertices.get(v).getAdjList().get(q).getTarget()+": city ";                   
                   
                      routeLength+=graph.vertices.get(v).getAdjList().get(q).getWeight();                   
                   
                      System.out.print(printedPath+"---route length: "+ routeLength);
              }
        
        }
      }
    }
    for (int i = 0; i < distance.length; i++) { // formatted print statement
      System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
    }

  }

    public ArrayList<Vertex> getPath() {
        return path;
    }

  // Finding the minimum distance
  private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
    
      int minDistance = Integer.MAX_VALUE; // initialize to positive infinity
    
      int minDistanceVertex = -1; // index of vertex with minimum edge 
    
      for (int i = 0; i < distance.length; i++) {
      
          if (!visitedVertex[i] && distance[i] < minDistance) { // check that vertex is not visited and distance is less than min distance
        
              minDistance = distance[i]; // reassign min distance
        
              minDistanceVertex = i; //  assign index of vertex with min distance so far
      }
    }
    return minDistanceVertex;
  }


    public boolean[] getVisitedVertex() {// will be used to identify which vertex's are included in minimum spanning tree
        return visitedVertex;
    }

    public int[] getDistance() { // shows cumulative distance 
        return distance;
    }
  
  
}
