package Easy.Minimum_Number_Of_Moves_to_Seat_Everyone;

import java.util.Arrays;

// 2037
public class Solution {

    public static void main(String[] args) {
        int[] seats = new int[] { 3, 1 ,5 };
        int[] students = new int[] { 2, 7 , 4 }; // 2 -> 1 = 1, 7 -> 5 = 2, 4 -> 3 = 1, total = 1 + 2 + 1 = 4 moves

        System.out.println(minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {

        int minMoves = 0;

        // Sort first
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            minMoves += Math.abs(students[i] - seats[i]); // Smallest with smallest
        }

        return minMoves;
    }
}
