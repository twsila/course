public class SquareGrid {

    private final int size;
    final String GREEN_DOT = "\u001B[32m.\u001B[0m"; // ANSI escape code for green
    // Constructor to initialize the grid size
    public SquareGrid(int size) {
        this.size = size;
    }

    // Method to display the square with a border
    public void display() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Print '.' for the border, and green dots '.' for the body
                if (row == 0 || row == size - 1 || col == 0 || col == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(GREEN_DOT); // Fill the body with dots
                }
            }
            System.out.println(); // Move to the next line
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int gridSize = 20; // Define the size of the grid

        SquareGrid squareGrid = new SquareGrid(gridSize);
        squareGrid.display();
    }
}
