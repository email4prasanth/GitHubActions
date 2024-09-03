// added java file
public class Main {
    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Main method to run the tests
    public static void main(String[] args) {
        // Test cases for the add method
        testAdd();
    }

    // Method to test the add function
    public static void testAdd() {
        assert add(1, 2) == 3 : "Test failed: add(1, 2) should return 3";
        assert add(1, -1) == 0 : "Test failed: add(1, -1) should return 0";
        System.out.println("All tests passed.");
    }
}
