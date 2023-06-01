package AirFreightApp;

import GraphFramework.*;
import java.io.File;
import java.io.FileNotFoundException;


/*
 *  @authors Asil, Qamar, Aroub,Khalida
 * B9A
 * CPCS-324
 * Project Code
 * 18th may. 2023
 */
public class AFRouteMap extends Graph {

    AFRouteMap(int verticesNo, int edgesNo, boolean b) {
        super(verticesNo, edgesNo, b);
    }

    AFRouteMap(File graphfile) throws FileNotFoundException {

        super(graphfile);
    }

    AFRouteMap() {

    }

    // Create Vertex
    @Override
    public Vertex createVertex(String label) {
        return new Location(label);
    }

    // Create Edge
    @Override
    public Edge createEdge(Vertex source, Vertex target, int weight) {
        return new Route(source, target, weight);
    }

    public void displayInfo() {
        displayInfo();
    }

}
