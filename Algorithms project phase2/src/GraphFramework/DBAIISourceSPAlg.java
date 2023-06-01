/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphFramework;

/**
 *
 * @author asil
 */
public class DBAIISourceSPAlg {
    Graph graph;
    
    SingleSourceSPAlg SPAlg;
    
    public DBAIISourceSPAlg(Graph graph){
                this.graph= graph;
    }
    
    public void computeDijkstraBasedSPAlg(){
    
        for(int i=0;i<graph.verticesNo;i++){
    
        System.out.println("The starting point location is "+graph.vertices.get(i));
    
        System.out.println("The routes from location "+graph.vertices.get(i)+" to the rest of the locations are:");
    
    
        SPAlg.computeDijkstraAlg(graph,graph.vertices.get(i));
    }}
}

