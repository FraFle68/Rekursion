import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int iteration = 0;
        boolean[] testArray = new boolean[5];
        for(boolean content : testArray) {
            System.out.println(content);
        }
        int testBoolean = recursArray(iteration, testArray);
    }
    public static int recursArray(int iteration, boolean[] testArray) {
        Scanner scanner = new Scanner(System.in);

        testArray[iteration] = true;
        iteration++;

        System.out.println("Iteration vor dem nächsten Aufruf: " + iteration);
        for(boolean content : testArray) {
            System.out.println(content);
        }

        if ("n".equals(scanner.next())) {
            int a = recursArray(iteration, testArray);
        }

        System.out.println("Iteration nach dem Return: " + iteration);
        for(boolean content : testArray) {
            System.out.println(content);
        }

        return 5;
    }
}
