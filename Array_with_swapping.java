import java.util.Scanner;

public class Array_with_swapping {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter five values for a[]");

        for (int i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }

        for (int j = 0; j < 5; j++) {
            b[j] = a[j];
                System.out.println("The value" +  b[j]);

            }

        }
    }
