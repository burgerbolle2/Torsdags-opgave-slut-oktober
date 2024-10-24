package Task2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];  // Initialize the array
        this.seats[0][0] = "X";  // Reserve the director's seat

        // Initialize all other seats to "O" (unreserved)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (i != 0 || j != 0) {  // Skip the director's seat
                    this.seats[i][j] = "O";
                }
            }
        }
    }

    public int getRows() {
        return seats.length;  // Return the number of rows
    }

    public int getSeats() {
        return seats[0].length;  // Return the number of seats in the first row
    }

    // If the seat is not yet reserved, it's value is "O".
    // In that case, change the value to "X" and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[0].length) {
            if (seats[row][seat].equals("O")) {  // Check if the seat is unreserved
                seats[row][seat] = "X";  // Reserve the seat
                return true;
            }
        }
        return false;  // Invalid input or already reserved
    }

    // Cancel the reservation of a seat if it is reserved (X)
    public boolean cancelReservation(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[0].length) {
            if (seats[row][seat].equals("X")) {  // Check if the seat is reserved
                seats[row][seat] = "O";  // Cancel the reservation
                return true;
            }
        }
        return false;  // Invalid input or not reserved
    }

    public String toString() {
        String result = "";  // Initialize as an empty string
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}