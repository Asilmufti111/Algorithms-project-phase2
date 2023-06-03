/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphFramework;

/*
 *  @authors Asil, Qamar, Aroub,Khalida, Huda
 * B9A
 * CPCS-324
 * Project Code
 * 4th June. 2023
 */
public class DBAIISourceSPAlg {
    Graph graph;
    
    SingleSourceSPAlg SPAlg;
    
    public DBAIISourceSPAlg(Graph graph){
        this.graph= graph;
        
        computeDijkstraBasedSPAlg();
    }
    
    public void computeDijkstraBasedSPAlg(){
    
        for(int i=0;i<graph.verticesNo;i++){//go thro all vertices
            
            SPAlg= new SingleSourceSPAlg();
    
            System.out.println("\nThe starting point location is "+graph.vertices.get(i).getLabel()); //get source
            
            System.out.println("\nThe routes from location "+graph.vertices.get(i).getLabel()+" to the rest of the locations are:");
            
            SPAlg.computeDijkstraAlg(graph,graph.vertices.get(i));//compute dijkstra
    }}
}
