import java.util.Scanner;

public class Arrays_with_total {
    public static void main(String[] x) {
        int total =0;
        int games_id[] = new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter five numbers ");
        for( int i =0; i<5 ;i++ )
        {
            games_id[i] = s.nextInt();
        }
        for ( int j = 0; j < 5; j++) {
            System.out.println(games_id[j]);
            total = total + games_id[j];

        }

        System.out.println( "The answer is"  + " " + total);
    }
}

