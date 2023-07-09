package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;


public class GridAgent extends Agent {
	
    private GridClass grid;

    protected void setup() {
    	
        // Initialize a 5x5 grid
        grid = new GridClass(5, 5);

        // Add behaviour
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {
                // For example, set a random cell to a random value
                int row = (int) (Math.random() * grid.getRows());
                int column = (int) (Math.random() * grid.getColumns());
                int value = (int) (Math.random() * 100); // Random value between 0 and 100
                grid.setCell(row, column, value);

                // Print the grid to see the changes
                grid.printGrid();
            }
        });
    }
}
