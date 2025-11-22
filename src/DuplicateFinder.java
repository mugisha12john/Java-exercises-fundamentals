public class DuplicateFinder {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C++", "Java", "C", "Python"};

        System.out.println("Duplicate values in the array are:");

        // Compare each element with every other element
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                // Using .equals() for string comparison
                if (names[i].equals(names[j]) && (i != j)) {
                    System.out.println(names[j]);
                }
            }
        }
    }
}