package AirFreightApp;

import GraphFramework.Vertex;


/*
 *  @authors Asil, Qamar, Aroub,Khalida
 * B9A
 * CPCS-324
 * Project Code
 * 18th may. 2023
 */
public class Location extends Vertex {

    public Location(String label) {
        super(label);
    }

    // Methods
    @Override
    public void setLabel(String label) {
        super.setLabel(label);
    }

    @Override
    public void displayInfo() {
        System.out.println(": city" + super.getLabel());
    }

}
