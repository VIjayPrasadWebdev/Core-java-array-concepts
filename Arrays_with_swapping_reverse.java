import java.util.Scanner;

public class Arrays_with_swapping_reverse {
    public static void main(String []args) {

        int a[] = new int[5];
        int b[] = new int[5];
        int i, j;

        System.out.println("Enter values for A");
        Scanner s=new Scanner(System.in);
        for(i=0; i<5; i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Elements in A[] swapping to B[]");
        for(i=0; i<5; i++)
        {
            b[i] = a[i];
            System.out.print(b[i] + " ");
        }
        System.out.println("\n Reverse array");
        for(j=5-1; j>=0; j--)
        {
            System.out.print(b[j] + " ");
        }


    }


}
