package AirFreightApp;

import GraphFramework.Vertex;


/*
 *  @authors Asil, Qamar, Aroub,Khalida, Huda
 * B9A
 * CPCS-324
 * Project Code
 * 4th June. 2023
 */
public class Location extends Vertex {

    String city;
    
    public Location(String label) {
        super(label);
        this.city = label;
    }

    // Methods
    @Override
    public void setLabel(String label) {
        super.setLabel(label);
    }

    @Override
        public String displayInfo() {
        return super.displayInfo() +": city " + city;
    }

}
