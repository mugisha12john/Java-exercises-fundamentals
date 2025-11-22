public class MaxMinFinder {
    public static void main(String[] args) {
        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Original Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}