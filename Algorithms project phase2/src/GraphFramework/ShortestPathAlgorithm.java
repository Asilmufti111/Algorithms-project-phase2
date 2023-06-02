/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphFramework;

/*
 *  @authors Asil, Qamar, Aroub,Khalida
 * B9A
 * CPCS-324
 * Project Code
 * 4th June. 2023
 */
public class ShortestPathAlgorithm {
    Graph graph;
    DBAIISourceSPAlg allSources;
    
    public ShortestPathAlgorithm(Graph graph){
        
    this.graph=graph;
    
    allSources=new DBAIISourceSPAlg(graph);
    }
}
