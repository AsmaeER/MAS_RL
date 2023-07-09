package agents;

public class GridClass {
	    private int rows;
	    private int columns;
	    private int[][] grid;

	    public GridClass(int rows, int columns) {
	        this.rows = rows;
	        this.columns = columns;
	        this.grid = new int[rows][columns];
	    }

	    public int getCell(int row, int column) {
	        return grid[row][column];
	    }

	    public void setCell(int row, int column, int value) {
	        grid[row][column] = value;
	    }

	    public int getRows() {
			return rows;
		}

		public void setRows(int rows) {
			this.rows = rows;
		}

		public int getColumns() {
			return columns;
		}

		public void setColumns(int columns) {
			this.columns = columns;
		}

		public int[][] getGrid() {
			return grid;
		}

		public void setGrid(int[][] grid) {
			this.grid = grid;
		}
		
		public boolean isValidPosition(int row, int column) {
		    return row >= 0 && row < rows && column >= 0 && column < columns;
		}

		
		public boolean isCellAvailable(int row, int column) {
		    return isValidPosition(row, column) && grid[row][column] == 0;
		}


		public void printGrid() {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(grid[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
