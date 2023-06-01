package GraphFramework;

import java.util.LinkedList;
import java.util.List;

/*
 *  @authors Asil, Qamar, Aroub,Khalida
 * B9A
 * CPCS-324
 * Project Code
 * 4th June 2023
 */
public class Vertex {

    private String label;
    private Boolean isVisited;
    private List<Edge> adjList;

    public Vertex() {
        adjList = new LinkedList<>();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getIsVisited() {
        return isVisited;
    }

    public void setIsVisited(Boolean isVisited) {
        this.isVisited = isVisited;
    }

    public List<Edge> getAdjList() {
        return adjList;
    }

    public void setAdjList(List<Edge> adjList) {
        this.adjList = adjList;
    }

    public Vertex(String label) { //creating new vertex
        this.label = label; //value of vertex
        this.isVisited = false; //vertex not visited yet 
        adjList = new LinkedList<>(); //create new linkedlist for each vertex (for its edges)
    }

    public void displayInfo() {
        System.out.print(label);
    }

}

