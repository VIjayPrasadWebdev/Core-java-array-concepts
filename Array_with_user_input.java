
import java.util.Scanner;

public class Array_with_user_input {
    public static void main(String[] x) {
        int game_id[] =new int [5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the game id");
        for(int i=0; i<5; i++ )
        {
            game_id[i]=s.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            System.out.println(game_id[i]);
        }
    }
}