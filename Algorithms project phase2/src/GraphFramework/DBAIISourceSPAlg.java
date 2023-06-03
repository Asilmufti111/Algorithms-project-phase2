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

    public DBAIISourceSPAlg(Graph graph) {
        this.graph = graph;

        computeDijkstraBasedSPAlg();
    }

    public void computeDijkstraBasedSPAlg() {

        for (int i = 0; i < graph.verticesNo; i++) {//go thro all vertices
            SPAlg = new SingleSourceSPAlg();
            SPAlg.computeDijkstraAlg(graph, graph.vertices.get(i));//compute dijkstra
        }
    }

}
