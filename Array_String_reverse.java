import java.util.Scanner;
public class Array_String_reverse {
    public static void main(String []ar)
    {
        String code_word[]= new String[5];
        int i;
        System.out.println("Enter the code word");
        Scanner s=new Scanner(System.in);
        for(i=0; i<5; i++)
        {
            code_word[i] = s.next();

        }

       for(i=5-1; i>=0 ; i--)
       {
           System.out.print(code_word[i] + " ");
       }
    }
}
