import java.util.Scanner;

public class Array_find_the_number {
    public static void main(String x[])
    {
        int found=0, input, position=0;
        int find [] =new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 Numbers");
        for(int i =0; i<5; i++)
        {
            find[i]=s.nextInt();
        }
        System.out.println("which number you want to find");

       input=s.nextInt();
for(int i=0; i<5; i++)
{
    if(find[i] == input)
    {
        found=1;
        position=i+1;
    }

}
if(found==1)

            {
                System.out.println("found");
                System.out.println("Position is " + position);

            }
            else
                System.out.println("Not found");
        }

    }

