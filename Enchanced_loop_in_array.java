import java.util.Scanner;

public class Enchanced_loop_in_array {
    public static void main(String[] x) {
        int array[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter five values");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
            for (int j : array) {
                System.out.println(j);
            }
        }
    }

