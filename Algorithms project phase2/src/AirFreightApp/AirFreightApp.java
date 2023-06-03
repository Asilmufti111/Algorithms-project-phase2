package AirFreightApp;

import GraphFramework.ShortestPathAlgorithm;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *  @authors Asil, Qamar, Aroub,Khalida, Huda
 * B9A
 * CPCS-324
 * Project Code
 * 4th June. 2023
 */
public class AirFreightApp {

    public static void main(String[] args) throws FileNotFoundException {
        // ======================Main======================== //
        Scanner input = new Scanner(System.in);

        // Intilize variables
        int verticesNo = 0; // number of vertices
        int edgesNo = 0; // number of edges
        boolean isDigraph = false;

        // ======================Header========================//
        System.out.println("""
                                   \t\t--------------------------------------------------------------------------
                                   \t\t|Implement Dijkstra algorithm for the single-source shortest path problem|
                                   \t\t--------------------------------------------------------------------------
                                   """);

        System.out.println("""
                                   \t\t**********  (1) Requirement 1 Using Read_from_Graph Func. ********** 
                                   \t\t**********  (2) Requirement 2 Using Make_Graph Func.      ********** 
                                   """);

        // ------- Read User Input for the Selected Requirement -------- //
        System.out.print("Select Requirement Option --> ");

        int userInput = input.nextInt(); // Option of the Requirement

        // make sure user enter within option
        while (userInput != 1 && userInput != 2) {
            System.out.println("Wrong Selection. ");
            System.out.print("Select Requirement Option -> ");
            userInput = input.nextInt();
        }

        // ------------------------ Requirement 1 ------------------------ //
        if (userInput == 1) {
            System.out.println("\n\t\t\t-Requirement 1 Using Read From Graph function-");

            File graphFile = new File("graph.txt"); // Read from File
            AFRouteMap TheMap = new AFRouteMap(); // Create An Object of Graph as TheMap
            TheMap.readGraphFromFile(graphFile); // Access readGraphFromFile Method in Graph Class

            ShortestPathAlgorithm dijkstra = new ShortestPathAlgorithm(TheMap);

        } // End of Requirement 1

        // --------------------- Requirement 2 ------------------ //
        if (userInput == 2) {
            System.out.println("\n\t\t\t-Requirement 2 Using Make Graph function-");
            System.out.print("\nDo you want the graph directed (yes/no)? "); // Ask user if he/she want to do the
            // algorithm with direct graph
            String choiceDigraph = input.next();

            // FOR WRONG INPUT
            while (!choiceDigraph.equalsIgnoreCase("yes") && !choiceDigraph.equalsIgnoreCase("no")) {
                System.out.println("\n---- Invalid input! ----");
                System.out.print("> Enter your choice : ");
                choiceDigraph = input.next();
            }
            // If the user answer was yes make directed graph
            if (choiceDigraph.equalsIgnoreCase("yes")) {
                isDigraph = true;
            }
            System.out.println("Cases of Edges(m) and Vertcies(n):");
            System.out.println("(1) n= 2000, m= 10000\n"
                    + "(2) n= 3000, m= 15000\n"
                    + "(3) n= 4000, m= 20000\n"
                    + "(4) n= 5000, m= 25000\n"
                    + "(5) n= 6000, m= 30000");

            do {
                // ------- Read User Input for the Selected Case -------- //

                System.out.print("\nSelect your Test Option -> ");
                userInput = input.nextInt(); // Option of the Case
                switch (userInput) {
                  
                    case 1: {
                      //  verticesNo = 2000;
                        //edgesNo = 10000;
                         verticesNo = 6;
                            edgesNo = 8;
                    }
                    break;

                    case 2: {
                        verticesNo = 3000;
                        edgesNo = 15000;
                    }
                    break;
                    case 3: {
                        verticesNo = 4000;
                        edgesNo = 20000;
                    }
                    break;
                    case 4: {
                        verticesNo = 5000;
                        edgesNo = 25000;
                    }
                    break;
                    case 5: {
                        verticesNo = 6000;
                        edgesNo = 30000;
                    }
                    break;

                    default:
                        System.out.println("Option not found.");
                }
            } while (userInput > 5 || userInput < 1);

            AFRouteMap TheMap = new AFRouteMap(verticesNo, edgesNo, isDigraph); // Create An Object of Graph as TheMap
            long startTime = System.currentTimeMillis(); // Store the time before invoke the algorithm
            ShortestPathAlgorithm dijkstra = new ShortestPathAlgorithm(TheMap); // Create DijkstraAlg object to use Dijkstra algorithm
            long finishTime = System.currentTimeMillis();// Store the time after invoke the algorithm
            // Print the run#ing time
            System.out.println("Run time for Dijkstra algorithm " + (finishTime - startTime) + " ms \n");

        } // End of requirement 2
        input.close();
    } // End of Main
} // End of Class
