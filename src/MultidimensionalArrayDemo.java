public class MultidimensionalArrayDemo {
    public static void main(String[] args) {
        // delcaring and initializing a 2D array
        int[][] seats = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // printing the 2D array using nested loops
        for (int row = 0; row < seats.length; row++){
            for (int col = 0; col < seats[row].length; col++){
                System.out.print(seats[row][col] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
