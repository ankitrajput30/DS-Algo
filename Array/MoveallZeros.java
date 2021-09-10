import java.util.*;

public class MoveallZeros
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Elements");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int count = 0;
        int temp;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] != 0)
            {
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;

                count++;
             }
        }
        for(int i = 0;i < n;i++)
        System.out.println(" " + arr[i]);
    }
}
