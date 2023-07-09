package agents;

import java.util.List;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class RobotAgent extends Agent {
	
	private int currentRow;
    private int currentColumn;
    private int goalRow;
    private int goalColumn;
    private List<PositionClass> pathToGoal;
	
    protected void setup() {
     
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {

            }
        });
    }
    
    public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getCurrentColumn() {
		return currentColumn;
	}

	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}

	public int getGoalRow() {
		return goalRow;
	}

	public void setGoalRow(int goalRow) {
		this.goalRow = goalRow;
	}

	public int getGoalColumn() {
		return goalColumn;
	}

	public void setGoalColumn(int goalColumn) {
		this.goalColumn = goalColumn;
	}

	public List<PositionClass> getPathToGoal() {
		return pathToGoal;
	}

	public void setPathToGoal(List<PositionClass> pathToGoal) {
		this.pathToGoal = pathToGoal;
	}
	
	private boolean isAtGoalPosition() {
        // Vérifier si le robot est arrivé à la position du but actuel
        return currentRow == goalRow && currentColumn == goalColumn;
    }
	
	private void moveUp() {
        currentRow--;
    }

    private void moveDown() {
        currentRow++;
    }

    private void moveLeft() {
        currentColumn--;
    }

    private void moveRight() {
        currentColumn++;
    }
    
    private void followPath() {
        if (pathToGoal != null && !pathToGoal.isEmpty()) {
        	PositionClass nextPosition = pathToGoal.remove(0);
            int nextRow = nextPosition.getRow();
            int nextColumn = nextPosition.getColumn();

            if (nextRow < currentRow) {
                moveUp();
            } else if (nextRow > currentRow) {
                moveDown();
            } else if (nextColumn < currentColumn) {
                moveLeft();
            } else if (nextColumn > currentColumn) {
                moveRight();
            }
        }
    }
	

}
