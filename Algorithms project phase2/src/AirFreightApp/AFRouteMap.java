package AirFreightApp;

import GraphFramework.*;
import java.io.File;
import java.io.FileNotFoundException;

/*
 *  @authors Asil, Qamar, Aroub,Khalida, Huda
 * B9A
 * CPCS-324
 * Project Code
 * 4th June. 2023
 */

public class AFRouteMap extends Graph {

    AFRouteMap(int verticesNo, int edgesNo, boolean b) {
        super(verticesNo, edgesNo, b);
    }

    AFRouteMap(File graphfile) throws FileNotFoundException {
        super(graphfile);
    }

   @Override
    public Location createVertex(String label) {
        return new Location(label);
    }

    @Override
    public Route createEdge(Vertex source, Vertex target, int weight) {
        return new Route(source, target, weight);
    }

}
