import java.util.Scanner;

public class Array_with_even_and_total_even {
    public static void main(String []x){
        int Increment_even_numbers=0 , total =0;
        int even[] = new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 Numbers");
        for(int i=0; i<5; i++){
            even[i] = s.nextInt();
        }

        for(int j=0; j<5; j++)
        {
            if(even[j]%2==0)
            {
            Increment_even_numbers++;
                System.out.println(even[j]);
                total = total+ even[j];
            }

        }
        System.out.println("The answer is " + total);
    }
}
