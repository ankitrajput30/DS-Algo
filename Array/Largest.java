import java.util.*;

public class Largest
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
        for(int i=0;i<n;i++)
        {
           if(arr[0]<arr[i])
           {
               arr[0] = arr[i];
           }
        }
        System.out.print("The largest element is : " + arr[0]);
    }
}