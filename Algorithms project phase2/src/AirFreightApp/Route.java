package AirFreightApp;

import GraphFramework.*;

/*
 *  @authors Asil, Qamar, Aroub,Khalida
 * B9A
 * CPCS-324
 * Project Code
 * 18th may. 2023
 */
public class Route extends Edge {

    public Route(Vertex source, Vertex target, int weight) {
        super(source, target, weight);
    }

    // Methods
    @Override
    public void displayInfo() {
        System.out.println("---route length: " + super.getWeight());
    } // End of Method

} // End of Class
