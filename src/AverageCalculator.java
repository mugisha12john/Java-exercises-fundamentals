public class AverageCalculator {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        // Calculate the sum of all elements
        for (int number : numbers) {
            sum += number;
        }

        // Calculate average (cast sum to double for accurate division)
        double average = (double) sum / numbers.length;

        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Average value: " + average);
    }
}