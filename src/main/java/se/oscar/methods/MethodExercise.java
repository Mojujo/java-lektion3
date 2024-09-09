package se.oscar.methods;

public class MethodExercise {
    public static void main(String[] args) {
        printGreeting();
        printPersonalGreeting("Oscar");
        printSum(1, 4);

        int sum = multiplyNumbers(2,4);
        System.out.println(sum);

        String name = createFullName("Oscar", "Törnqvist");
        System.out.println(name);

    }
    public static void printGreeting() {
        System.out.println("Hej, välkommen till Java!");
    }
    public static void printPersonalGreeting(String name) {
        System.out.println("Hej, "+ name);
    }
    public static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;

    }
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
