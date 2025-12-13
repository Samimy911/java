public class QuestionD {

    public static void main(String[] args) {

        // 1. Declare 4×5 String array
        String[][] table = {
            {"A1", "A2", "A3", "A4", "A5"},
            {"B1", "B2", "B3", "B4", "B5"},
            {"C1", "C2", "C3", "C4", "C5"},   // 3rd row
            {"D1", "D2", "D3", "D4", "D5"}
        };

        // 2. Display the data in the 3rd row (index 2)
        System.out.println("Data in the 3rd row:");
        for (int j = 0; j < table[2].length; j++) {
            System.out.print(table[2][j] + " ");
        }
        System.out.println("\n");

        // 3. Demonstrate TimeOfDay class
        TimeOfDay t1 = new TimeOfDay();       // no-parameter constructor
        TimeOfDay t2 = new TimeOfDay(14, 45); // parameterized constructor

        System.out.println("TimeOfDay objects:");
        t1.display();
        t2.display();
    }
}


// =====================
// TIMEOFDAY CLASS
// =====================
class TimeOfDay {

    private int hour;
    private int minute;

    // No-argument constructor
    public TimeOfDay() {
        this.hour = 0;
        this.minute = 0;
    }

    // Parameterized constructor
    public TimeOfDay(int hour, int minute) {
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hour must be 0–23");
        if (minute < 0 || minute > 59)
            throw new IllegalArgumentException("Minute must be 0–59");

        this.hour = hour;
        this.minute = minute;
    }

    // Display method
    public void display() {
        System.out.printf("Time: %02d:%02d%n", hour, minute);
    }
}
