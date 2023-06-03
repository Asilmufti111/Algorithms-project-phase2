package AirFreightApp;

import GraphFramework.*;

/*
 *  @authors Asil, Qamar, Aroub,Khalida, Huda
 * B9A
 * CPCS-324
 * Project Code
 * 4th June. 2023
 */
public class Route extends Edge {

    int route;
    
    public Route(Vertex source, Vertex target, int weight) {
        super(source, target, weight);
        route = weight;
    }

    // Methods
    @Override
    public void displayInfo() {
        System.out.println("---route length: " + route);
    } // End of Method

} // End of Class
